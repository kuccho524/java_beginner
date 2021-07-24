import comment.FirstHalf;

class RocketParty {

  public static void main (String[] args) throws Exception {
    // 前半のメッセージ
    FirstHalf.introduction();
    FirstHalf.name();

    // 後半のメッセージ
    comment.LatterHalf.battle();
    comment.LatterHalf.goodbye();
  }

}
