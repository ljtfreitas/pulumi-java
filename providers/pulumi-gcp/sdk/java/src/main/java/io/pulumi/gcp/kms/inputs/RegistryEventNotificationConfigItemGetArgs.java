// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.kms.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class RegistryEventNotificationConfigItemGetArgs extends io.pulumi.resources.ResourceArgs {

    public static final RegistryEventNotificationConfigItemGetArgs Empty = new RegistryEventNotificationConfigItemGetArgs();

    @Import(name="pubsubTopicName", required=true)
      private final Output<String> pubsubTopicName;

    public Output<String> getPubsubTopicName() {
        return this.pubsubTopicName;
    }

    @Import(name="subfolderMatches")
      private final @Nullable Output<String> subfolderMatches;

    public Output<String> getSubfolderMatches() {
        return this.subfolderMatches == null ? Output.empty() : this.subfolderMatches;
    }

    public RegistryEventNotificationConfigItemGetArgs(
        Output<String> pubsubTopicName,
        @Nullable Output<String> subfolderMatches) {
        this.pubsubTopicName = Objects.requireNonNull(pubsubTopicName, "expected parameter 'pubsubTopicName' to be non-null");
        this.subfolderMatches = subfolderMatches;
    }

    private RegistryEventNotificationConfigItemGetArgs() {
        this.pubsubTopicName = Output.empty();
        this.subfolderMatches = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(RegistryEventNotificationConfigItemGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<String> pubsubTopicName;
        private @Nullable Output<String> subfolderMatches;

        public Builder() {
    	      // Empty
        }

        public Builder(RegistryEventNotificationConfigItemGetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.pubsubTopicName = defaults.pubsubTopicName;
    	      this.subfolderMatches = defaults.subfolderMatches;
        }

        public Builder pubsubTopicName(Output<String> pubsubTopicName) {
            this.pubsubTopicName = Objects.requireNonNull(pubsubTopicName);
            return this;
        }

        public Builder pubsubTopicName(String pubsubTopicName) {
            this.pubsubTopicName = Output.of(Objects.requireNonNull(pubsubTopicName));
            return this;
        }

        public Builder subfolderMatches(@Nullable Output<String> subfolderMatches) {
            this.subfolderMatches = subfolderMatches;
            return this;
        }

        public Builder subfolderMatches(@Nullable String subfolderMatches) {
            this.subfolderMatches = Output.ofNullable(subfolderMatches);
            return this;
        }
        public RegistryEventNotificationConfigItemGetArgs build() {
            return new RegistryEventNotificationConfigItemGetArgs(pubsubTopicName, subfolderMatches);
        }
    }
}
