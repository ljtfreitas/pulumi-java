// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.ec2.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class SpotInstanceRequestCreditSpecificationGetArgs extends io.pulumi.resources.ResourceArgs {

    public static final SpotInstanceRequestCreditSpecificationGetArgs Empty = new SpotInstanceRequestCreditSpecificationGetArgs();

    /**
     * Credit option for CPU usage. Valid values include `standard` or `unlimited`. T3 instances are launched as unlimited by default. T2 instances are launched as standard by default.
     * 
     */
    @InputImport(name="cpuCredits")
    private final @Nullable Input<String> cpuCredits;

    public Input<String> getCpuCredits() {
        return this.cpuCredits == null ? Input.empty() : this.cpuCredits;
    }

    public SpotInstanceRequestCreditSpecificationGetArgs(@Nullable Input<String> cpuCredits) {
        this.cpuCredits = cpuCredits;
    }

    private SpotInstanceRequestCreditSpecificationGetArgs() {
        this.cpuCredits = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SpotInstanceRequestCreditSpecificationGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> cpuCredits;

        public Builder() {
    	      // Empty
        }

        public Builder(SpotInstanceRequestCreditSpecificationGetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.cpuCredits = defaults.cpuCredits;
        }

        public Builder setCpuCredits(@Nullable Input<String> cpuCredits) {
            this.cpuCredits = cpuCredits;
            return this;
        }

        public Builder setCpuCredits(@Nullable String cpuCredits) {
            this.cpuCredits = Input.ofNullable(cpuCredits);
            return this;
        }
        public SpotInstanceRequestCreditSpecificationGetArgs build() {
            return new SpotInstanceRequestCreditSpecificationGetArgs(cpuCredits);
        }
    }
}