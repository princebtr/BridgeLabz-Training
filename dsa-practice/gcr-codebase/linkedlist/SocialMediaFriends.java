class FriendNode {
    int friendId;
    FriendNode next;

    FriendNode(int id) {
        friendId = id;
    }
}

class UserNode {
    int id;
    String name;
    FriendNode friends;
    UserNode next;

    UserNode(int id, String name) {
        this.id = id;
        this.name = name;
    }
}
