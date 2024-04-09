package Part;

public class SoftwareArchitecture {

	public static void main(String[] args) {
		System.out.println("소프트웨어 구조");
		System.out.println("");
		System.out.println("소프트웨어 공학\n 정의: 품질 높은 소프트웨어를 효율적으로 개발하기 위한 학문\n\n3R: 역공학,"
				+ "재공학,재사용\n역공학(Reverse Engineering)\n 유지보수의 생산성을 통해 소프트웨어 위기를 극복한다"
				+ "\n 유지보수성 향상\n CASE도구 사용 용이\n\n재공학(Re-Engineering)\n 유지보수의 생산성을 통해 위기극복"
				+ "\n 과정: 분석 -> 재구성 -> 역공학 -> 이관\n\n재사용(Reuse)\n 정의:"
				+ " 이미 개발된 소프트웨어의 전체 또는 일부를 다시 사용하는 것\n 범위\n  -함수와 객체 재사용:"
				+ " 클래스나 함수 단위로 구현된 소스코드의 재사용\n  -컴포넌트 재사용: 독립적인 소프트웨어 컴포넌트의 재사용\n"
				+ "  -애플리케이션 재사용: 기존 애플리케이션 또는 그 일부를 새로운 소프트웨어 개발에 재사용"
				+ "\n\n 방법\n  -합성 중심(Composition Based, 블록구성): 모듈 조합\n"
				+ "  -생성 중심(Generation Based, 패턴구성): 추상화된 형태의 명세를 구체화\n\n");
		System.out.println("소프트웨어 개발 단계\n 계획->요구사항 분석->설계->구현->테스트->유지보수\n");
		System.out.println("소프트웨어 개발 방법론\n 구조적 방법론(하향식)\n 정의: 절차지향적인 소프트웨어 개발 방법론"
				+ "\n 정보공학 방법론(상향식)\n -계획,분석,설계,구축에 정형화된 기법들을 상호 연관성있게 통합하여 적용"
				+ "\n 객체지향 개발 방법론(상향식)\n 현실 개체(Entity)를 속석(Attribute)과 메서드(Method)로 표현"
				+ "\n CBD(Component Based Development)방법론\n 정의: 재사용 가능한 컴포넌트의 개발 또는"
				+ " 상용 컴포넌트를 조합하여 애플리케이션 개발"
				+ "\n 애자일 방법론\n 종류\n  XP(eXtreme Programming): 반복적이고 점진적으로 개발"
				+ "\n  SCRUM: 유연하고 생산적인 프로젝트 관리방식\n  FDD: 기능 중심 반복\n  Crystal 방법론"
				+ ": 프로젝트 크기, 중요도에 따라 조정\n");
		System.out.println("소프트웨어 개발모델\n폭포수 모델(Waterfall Model\n 특징: 순차적 접근, 단계별 검증"
				+ ", 병행 및 반복 진행의 부재, 경험 및 성공사례, 요구사항 변경의 어려움, 단계별 명확성, 고객 피드백의 부족"
				+ ", 유연성 부족\n\n프로토타이핑 모델(Prototyping Model\n 순서\n  계획수립->프로토타입 개발"
				+ "->사용자 평가->구현->인수\n\n 나선형 모델(Spiral Moedel)\n 폭포수 모델의 장점+프로토타이핑 모델의"
				+ " 장점, 위험분석 추가, 점증적 개발, 대규모 프로젝트나 위험부담이 큰 개발에 적합\n 순서\n  계획->위험분석"
				+ "->개발->사용자 평가\n\nRAD(Rapid Application Development)모델\n 매우 빠른 개발주기\n\n"
				+ "V모형\n 각 개발 단계에서 검증 및 테스트\n 장점: 체계적, 높은 신뢰성 / 단점: 요구사항 변경 어려움,"
				+ "초기 오류가 전체에 영향\n");
		System.out.println("애자일(Agile) 방법론\n개념: 신속하고 반복적인 작업을 통해 지속적으로 작동 가능한 소프트웨어를"
				+ " 개발하는 방식이다. 작은 구성요소를 빠르게 제공하고, 애자일 개발을 가능하게\n 하는 다양한 방법론의 집합을 가리킨다."
				+ "\n 경량(Lightweight)프로세스라고도 한다.\n\n 종류\n  XP(eXtream Programming)\n  특징"
				+ "\n   문서보다 코드 중시. 5개 핵심가치와 12개 실천항못이 있다.\n   5개 핵심가치: 용기,존중,의사소통"
				+ ",피드백,단순성\n   12개 실천항목: 짝 프로그래밍(Pair Programming), 계획 세우기(Planning Game)"
				+ ", 테스트 기반 개발(Test Driven Development)\n              고객 상주(On-site Customer)"
				+ ", 지속적인 통합(Continuous Integration), 코드 개선(Refactoring),\n	      작은 릴리즈"
				+ "(Small Releases),코딩 표준(Coding Standatds),공동 코드 소유(Collective code Owner"
				+ "ship)\n	      간단한 디자인(Simple Design), 시스템 메타포어(System Metaphor),"
				+ "작업시간 준수(Sustainable Pace)\n\n  스크럼\n  특징\n   개발 주기 30일, 매일 15분 회의"
				+ "\n\n  그 외 애자일 방법론\n   크리스털(Crystal), FDD(Feature-Driven Development)"
				+ ", ASD(Adaptive Software Development), 린(Lean)\n");
		System.out.println("IT 서비스 관리\n SLM(Service Level Management): 서비스 수준을 정량적으로"
				+ " 측정하고, 실적을 평가하여 미흡한 부분을 개선하는 관리활동\n SLA(Service Level Agreement)\n"
				+ " ITSM(Information Technology Service Management)\n ITIL(IT Inforstructure "
				+ "Libraty): IT 서비스를 쉽게 제공하고 관리할 수 있는 가이드 또는 프레임워크");

	}

}
