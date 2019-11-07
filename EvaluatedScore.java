public class EvaluatedScore implements Score
{
    private int p1;
    private int p2;

    public EvaluatedScore(int p1, int p2)
    {
        assert p1 != p2;
        this.p1 = p1;
        this.p2 = p2;
    }

    public int player1()
    {
        return this.p1;
    }

    public int player2()
    {
        return this.p2;
    }
}
