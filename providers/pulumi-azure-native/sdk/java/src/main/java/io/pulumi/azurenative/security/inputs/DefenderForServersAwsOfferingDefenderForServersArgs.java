// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.security.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * The Defender for servers connection configuration
 * 
 */
public final class DefenderForServersAwsOfferingDefenderForServersArgs extends io.pulumi.resources.ResourceArgs {

    public static final DefenderForServersAwsOfferingDefenderForServersArgs Empty = new DefenderForServersAwsOfferingDefenderForServersArgs();

    /**
     * The cloud role ARN in AWS for this feature
     * 
     */
    @Import(name="cloudRoleArn")
      private final @Nullable Output<String> cloudRoleArn;

    public Output<String> getCloudRoleArn() {
        return this.cloudRoleArn == null ? Output.empty() : this.cloudRoleArn;
    }

    public DefenderForServersAwsOfferingDefenderForServersArgs(@Nullable Output<String> cloudRoleArn) {
        this.cloudRoleArn = cloudRoleArn;
    }

    private DefenderForServersAwsOfferingDefenderForServersArgs() {
        this.cloudRoleArn = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DefenderForServersAwsOfferingDefenderForServersArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> cloudRoleArn;

        public Builder() {
    	      // Empty
        }

        public Builder(DefenderForServersAwsOfferingDefenderForServersArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.cloudRoleArn = defaults.cloudRoleArn;
        }

        public Builder cloudRoleArn(@Nullable Output<String> cloudRoleArn) {
            this.cloudRoleArn = cloudRoleArn;
            return this;
        }

        public Builder cloudRoleArn(@Nullable String cloudRoleArn) {
            this.cloudRoleArn = Output.ofNullable(cloudRoleArn);
            return this;
        }
        public DefenderForServersAwsOfferingDefenderForServersArgs build() {
            return new DefenderForServersAwsOfferingDefenderForServersArgs(cloudRoleArn);
        }
    }
}
