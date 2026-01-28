// Problem Statement: File Backup Scheduler
// File Backup Scheduler
// Scenario:
//  A system schedules file backups at different times.
// Requirements:
// Store backup tasks in PriorityQueue<BackupTask>
// Higher priority for critical folders
// Use Comparable for sorting
// Throw InvalidBackupPathException
// Execute tasks in priority order
// Concepts: PriorityQueue, Comparable, OOP, Exception Handling

import java.util.*;
public class FileBackupScheduler {
    public static void main(String[] args) {
        BackupScheduler scheduler = new BackupScheduler();
        try {
            scheduler.scheduleBackup("/user/docs/important.txt", 10);
            scheduler.scheduleBackup("/user/photos/vacation.jpg", 5);
            scheduler.scheduleBackup("/user/system/config.sys", 15);
        } catch (InvalidBackupPathException e) {
            System.out.println(e.getMessage());
        }

        scheduler.executeBackups();
    }
}

class BackupTask implements Comparable<BackupTask> {
    private String filePath;
    private int priority;

    public BackupTask(String filePath, int priority) {
        this.filePath = filePath;
        this.priority = priority;
    }

    public String getFilePath() {
        return filePath;
    }

    public int getPriority() {
        return priority;
    }

    @Override
    public int compareTo(BackupTask other) {
        return Integer.compare(other.priority, this.priority);
    }
}

class InvalidBackupPathException extends Exception {
    public InvalidBackupPathException(String message) {
        super(message);
    }
}

class BackupScheduler {
    private PriorityQueue<BackupTask> backupQueue;

    public BackupScheduler() {
        this.backupQueue = new PriorityQueue<>();
    }

    public void scheduleBackup(String filePath, int priority) throws InvalidBackupPathException {
        if (filePath == null || filePath.isEmpty()) {
            throw new InvalidBackupPathException("Invalid file path: " + filePath);
        }
        BackupTask task = new BackupTask(filePath, priority);
        backupQueue.add(task);
    }

    public void executeBackups() {
        while (!backupQueue.isEmpty()) {
            BackupTask task = backupQueue.poll();
            System.out.println("Backing up file: " + task.getFilePath() + " with priority: " + task.getPriority());
        }
    }
}


