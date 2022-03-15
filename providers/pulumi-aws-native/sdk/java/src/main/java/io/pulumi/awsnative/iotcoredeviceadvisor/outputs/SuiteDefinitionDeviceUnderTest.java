// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.iotcoredeviceadvisor.outputs;

import io.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class SuiteDefinitionDeviceUnderTest {
    private final @Nullable String certificateArn;
    private final @Nullable String thingArn;

    @CustomType.Constructor
    private SuiteDefinitionDeviceUnderTest(
        @CustomType.Parameter("certificateArn") @Nullable String certificateArn,
        @CustomType.Parameter("thingArn") @Nullable String thingArn) {
        this.certificateArn = certificateArn;
        this.thingArn = thingArn;
    }

    public Optional<String> getCertificateArn() {
        return Optional.ofNullable(this.certificateArn);
    }
    public Optional<String> getThingArn() {
        return Optional.ofNullable(this.thingArn);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SuiteDefinitionDeviceUnderTest defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String certificateArn;
        private @Nullable String thingArn;

        public Builder() {
    	      // Empty
        }

        public Builder(SuiteDefinitionDeviceUnderTest defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.certificateArn = defaults.certificateArn;
    	      this.thingArn = defaults.thingArn;
        }

        public Builder certificateArn(@Nullable String certificateArn) {
            this.certificateArn = certificateArn;
            return this;
        }

        public Builder thingArn(@Nullable String thingArn) {
            this.thingArn = thingArn;
            return this;
        }
        public SuiteDefinitionDeviceUnderTest build() {
            return new SuiteDefinitionDeviceUnderTest(certificateArn, thingArn);
        }
    }
}
