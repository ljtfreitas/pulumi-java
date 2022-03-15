// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.testing_v1.outputs;

import io.pulumi.core.annotations.CustomType;
import io.pulumi.googlenative.testing_v1.outputs.AppBundleResponse;
import io.pulumi.googlenative.testing_v1.outputs.FileReferenceResponse;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@CustomType
public final class AndroidTestLoopResponse {
    /**
     * The APK for the application under test.
     * 
     */
    private final FileReferenceResponse appApk;
    /**
     * A multi-apk app bundle for the application under test.
     * 
     */
    private final AppBundleResponse appBundle;
    /**
     * The java package for the application under test. The default is determined by examining the application's manifest.
     * 
     */
    private final String appPackageId;
    /**
     * The list of scenario labels that should be run during the test. The scenario labels should map to labels defined in the application's manifest. For example, player_experience and com.google.test.loops.player_experience add all of the loops labeled in the manifest with the com.google.test.loops.player_experience name to the execution. Scenarios can also be specified in the scenarios field.
     * 
     */
    private final List<String> scenarioLabels;
    /**
     * The list of scenarios that should be run during the test. The default is all test loops, derived from the application's manifest.
     * 
     */
    private final List<Integer> scenarios;

    @CustomType.Constructor
    private AndroidTestLoopResponse(
        @CustomType.Parameter("appApk") FileReferenceResponse appApk,
        @CustomType.Parameter("appBundle") AppBundleResponse appBundle,
        @CustomType.Parameter("appPackageId") String appPackageId,
        @CustomType.Parameter("scenarioLabels") List<String> scenarioLabels,
        @CustomType.Parameter("scenarios") List<Integer> scenarios) {
        this.appApk = appApk;
        this.appBundle = appBundle;
        this.appPackageId = appPackageId;
        this.scenarioLabels = scenarioLabels;
        this.scenarios = scenarios;
    }

    /**
     * The APK for the application under test.
     * 
    */
    public FileReferenceResponse getAppApk() {
        return this.appApk;
    }
    /**
     * A multi-apk app bundle for the application under test.
     * 
    */
    public AppBundleResponse getAppBundle() {
        return this.appBundle;
    }
    /**
     * The java package for the application under test. The default is determined by examining the application's manifest.
     * 
    */
    public String getAppPackageId() {
        return this.appPackageId;
    }
    /**
     * The list of scenario labels that should be run during the test. The scenario labels should map to labels defined in the application's manifest. For example, player_experience and com.google.test.loops.player_experience add all of the loops labeled in the manifest with the com.google.test.loops.player_experience name to the execution. Scenarios can also be specified in the scenarios field.
     * 
    */
    public List<String> getScenarioLabels() {
        return this.scenarioLabels;
    }
    /**
     * The list of scenarios that should be run during the test. The default is all test loops, derived from the application's manifest.
     * 
    */
    public List<Integer> getScenarios() {
        return this.scenarios;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AndroidTestLoopResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private FileReferenceResponse appApk;
        private AppBundleResponse appBundle;
        private String appPackageId;
        private List<String> scenarioLabels;
        private List<Integer> scenarios;

        public Builder() {
    	      // Empty
        }

        public Builder(AndroidTestLoopResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.appApk = defaults.appApk;
    	      this.appBundle = defaults.appBundle;
    	      this.appPackageId = defaults.appPackageId;
    	      this.scenarioLabels = defaults.scenarioLabels;
    	      this.scenarios = defaults.scenarios;
        }

        public Builder appApk(FileReferenceResponse appApk) {
            this.appApk = Objects.requireNonNull(appApk);
            return this;
        }

        public Builder appBundle(AppBundleResponse appBundle) {
            this.appBundle = Objects.requireNonNull(appBundle);
            return this;
        }

        public Builder appPackageId(String appPackageId) {
            this.appPackageId = Objects.requireNonNull(appPackageId);
            return this;
        }

        public Builder scenarioLabels(List<String> scenarioLabels) {
            this.scenarioLabels = Objects.requireNonNull(scenarioLabels);
            return this;
        }

        public Builder scenarios(List<Integer> scenarios) {
            this.scenarios = Objects.requireNonNull(scenarios);
            return this;
        }
        public AndroidTestLoopResponse build() {
            return new AndroidTestLoopResponse(appApk, appBundle, appPackageId, scenarioLabels, scenarios);
        }
    }
}
