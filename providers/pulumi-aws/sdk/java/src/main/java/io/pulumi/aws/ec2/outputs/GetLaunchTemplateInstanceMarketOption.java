// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.ec2.outputs;

import io.pulumi.aws.ec2.outputs.GetLaunchTemplateInstanceMarketOptionSpotOption;
import io.pulumi.core.internal.annotations.OutputCustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@OutputCustomType
public final class GetLaunchTemplateInstanceMarketOption {
    private final String marketType;
    private final List<GetLaunchTemplateInstanceMarketOptionSpotOption> spotOptions;

    @OutputCustomType.Constructor({"marketType","spotOptions"})
    private GetLaunchTemplateInstanceMarketOption(
        String marketType,
        List<GetLaunchTemplateInstanceMarketOptionSpotOption> spotOptions) {
        this.marketType = Objects.requireNonNull(marketType);
        this.spotOptions = Objects.requireNonNull(spotOptions);
    }

    public String getMarketType() {
        return this.marketType;
    }
    public List<GetLaunchTemplateInstanceMarketOptionSpotOption> getSpotOptions() {
        return this.spotOptions;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetLaunchTemplateInstanceMarketOption defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String marketType;
        private List<GetLaunchTemplateInstanceMarketOptionSpotOption> spotOptions;

        public Builder() {
    	      // Empty
        }

        public Builder(GetLaunchTemplateInstanceMarketOption defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.marketType = defaults.marketType;
    	      this.spotOptions = defaults.spotOptions;
        }

        public Builder setMarketType(String marketType) {
            this.marketType = Objects.requireNonNull(marketType);
            return this;
        }

        public Builder setSpotOptions(List<GetLaunchTemplateInstanceMarketOptionSpotOption> spotOptions) {
            this.spotOptions = Objects.requireNonNull(spotOptions);
            return this;
        }
        public GetLaunchTemplateInstanceMarketOption build() {
            return new GetLaunchTemplateInstanceMarketOption(marketType, spotOptions);
        }
    }
}
