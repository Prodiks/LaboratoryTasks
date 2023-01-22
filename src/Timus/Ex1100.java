///*
////package Timus;
////
////import java.util.Scanner;
////
//////public class Team
//////{
//////    private int _id;
//////    private int _numEx;
//////
//////    Team(int id, int numEx)
//////    {
//////        _id = id;
//////        _numEx = numEx;
//////    }
//////
//////    public int getId()
//////    {
//////        return _id;
//////    }
//////
//////    public void print()
//////    {
//////        System.out.println(_id + " " + _numEx);
//////    }
//////
//////    public int getNumEx()
//////    {
//////        return _numEx;
//////    }
//////}
////
//////public static Team[] sortTeams(Team[] teams)
//////{
//////    for(int i = 0; i < teams.length - 1)
//////    {
//////        for(int j = i + 1; j < teams.length)
//////        {
//////            if(teams[i].getNumEx() < teams[j].getNumEx())
//////            {
//////                Team tmp = teams[i];
//////                teams[i] = teams[j];
//////                teams[j] = tmp;
//////            }
//////        }
//////    }
//////    return teams;
//////}
////
////public class Ex1100
////{
////    public static void main(String[] args)
////    {
////        Scanner in = new Scanner(System.in);
////
////        int count = in.nextInt();
////        Team[] teams = null;
////        for(int i = 0; i < count; i++)
////        {
////            int id = in.nextInt();
////            int numEx = in.nextInt();
////
////            teams[i] = new Team(id, numEx);
////        }
////
////        sortTeam(teams);
////
////        for(int i = 0; i < teams.length; i++)
////            teams[i].print();
////
////        in.close();
////    }
////}
//*/
