// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.configuration.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class ConfigurationAggregatorAccountAggregationSource {
    private final List<String> accountIds;
    private final @Nullable Boolean allAwsRegions;
    private final @Nullable List<String> awsRegions;

    @OutputCustomType.Constructor
    private ConfigurationAggregatorAccountAggregationSource(
        @OutputCustomType.Parameter("accountIds") List<String> accountIds,
        @OutputCustomType.Parameter("allAwsRegions") @Nullable Boolean allAwsRegions,
        @OutputCustomType.Parameter("awsRegions") @Nullable List<String> awsRegions) {
        this.accountIds = accountIds;
        this.allAwsRegions = allAwsRegions;
        this.awsRegions = awsRegions;
    }

    public List<String> getAccountIds() {
        return this.accountIds;
    }
    public Optional<Boolean> getAllAwsRegions() {
        return Optional.ofNullable(this.allAwsRegions);
    }
    public List<String> getAwsRegions() {
        return this.awsRegions == null ? List.of() : this.awsRegions;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ConfigurationAggregatorAccountAggregationSource defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private List<String> accountIds;
        private @Nullable Boolean allAwsRegions;
        private @Nullable List<String> awsRegions;

        public Builder() {
    	      // Empty
        }

        public Builder(ConfigurationAggregatorAccountAggregationSource defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.accountIds = defaults.accountIds;
    	      this.allAwsRegions = defaults.allAwsRegions;
    	      this.awsRegions = defaults.awsRegions;
        }

        public Builder setAccountIds(List<String> accountIds) {
            this.accountIds = Objects.requireNonNull(accountIds);
            return this;
        }

        public Builder setAllAwsRegions(@Nullable Boolean allAwsRegions) {
            this.allAwsRegions = allAwsRegions;
            return this;
        }

        public Builder setAwsRegions(@Nullable List<String> awsRegions) {
            this.awsRegions = awsRegions;
            return this;
        }
        public ConfigurationAggregatorAccountAggregationSource build() {
            return new ConfigurationAggregatorAccountAggregationSource(accountIds, allAwsRegions, awsRegions);
        }
    }
}
