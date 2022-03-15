// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.toolresults_v1beta3.outputs;

import io.pulumi.core.annotations.CustomType;
import io.pulumi.googlenative.toolresults_v1beta3.outputs.AndroidTestResponse;
import io.pulumi.googlenative.toolresults_v1beta3.outputs.IosTestResponse;
import java.util.Objects;

@CustomType
public final class SpecificationResponse {
    /**
     * An Android mobile test execution specification.
     * 
     */
    private final AndroidTestResponse androidTest;
    /**
     * An iOS mobile test execution specification.
     * 
     */
    private final IosTestResponse iosTest;

    @CustomType.Constructor
    private SpecificationResponse(
        @CustomType.Parameter("androidTest") AndroidTestResponse androidTest,
        @CustomType.Parameter("iosTest") IosTestResponse iosTest) {
        this.androidTest = androidTest;
        this.iosTest = iosTest;
    }

    /**
     * An Android mobile test execution specification.
     * 
    */
    public AndroidTestResponse getAndroidTest() {
        return this.androidTest;
    }
    /**
     * An iOS mobile test execution specification.
     * 
    */
    public IosTestResponse getIosTest() {
        return this.iosTest;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SpecificationResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private AndroidTestResponse androidTest;
        private IosTestResponse iosTest;

        public Builder() {
    	      // Empty
        }

        public Builder(SpecificationResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.androidTest = defaults.androidTest;
    	      this.iosTest = defaults.iosTest;
        }

        public Builder androidTest(AndroidTestResponse androidTest) {
            this.androidTest = Objects.requireNonNull(androidTest);
            return this;
        }

        public Builder iosTest(IosTestResponse iosTest) {
            this.iosTest = Objects.requireNonNull(iosTest);
            return this;
        }
        public SpecificationResponse build() {
            return new SpecificationResponse(androidTest, iosTest);
        }
    }
}
