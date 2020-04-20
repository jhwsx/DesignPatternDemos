package com.wzc.p25_mediator._2_unsc_example;

/**
 * @author wangzhichao
 * @since 2019/12/11
 */
public class Test {
    public static void main(String[] args) {
        UnitedNationsSecurityCouncil unitedNationsSecurityCouncil =
                new UnitedNationsSecurityCouncil();
        USA usa = new USA(unitedNationsSecurityCouncil);
        Iraq iraq = new Iraq(unitedNationsSecurityCouncil);
        unitedNationsSecurityCouncil.register(usa);
        unitedNationsSecurityCouncil.register(iraq);

        usa.declare("我们已经在伊拉克发现了大规模杀伤性武器，这损害了美国在中东的利益。");
        iraq.declare("美国如果发现了，就拿出证据来。");
    }
}
