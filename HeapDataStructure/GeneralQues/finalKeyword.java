public class finalKeyword {
    public static void main(String[] args) {
        final StringBuffer sb=new StringBuffer("hello");
        sb.append("world");
        System.out.println(sb);
        sb.append("java");
        System.out.println(sb);
        //sb=sb.append("here u will get error because final keyword used ");
    }
}
