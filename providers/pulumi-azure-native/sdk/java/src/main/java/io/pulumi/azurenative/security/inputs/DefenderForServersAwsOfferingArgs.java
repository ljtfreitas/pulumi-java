// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.security.inputs;

import io.pulumi.azurenative.security.inputs.DefenderForServersAwsOfferingArcAutoProvisioningArgs;
import io.pulumi.azurenative.security.inputs.DefenderForServersAwsOfferingDefenderForServersArgs;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * The Defender for Servers AWS offering configurations
 * 
 */
public final class DefenderForServersAwsOfferingArgs extends io.pulumi.resources.ResourceArgs {

    public static final DefenderForServersAwsOfferingArgs Empty = new DefenderForServersAwsOfferingArgs();

    /**
     * The ARC autoprovisioning configuration
     * 
     */
    @Import(name="arcAutoProvisioning")
      private final @Nullable Output<DefenderForServersAwsOfferingArcAutoProvisioningArgs> arcAutoProvisioning;

    public Output<DefenderForServersAwsOfferingArcAutoProvisioningArgs> getArcAutoProvisioning() {
        return this.arcAutoProvisioning == null ? Output.empty() : this.arcAutoProvisioning;
    }

    /**
     * The Defender for servers connection configuration
     * 
     */
    @Import(name="defenderForServers")
      private final @Nullable Output<DefenderForServersAwsOfferingDefenderForServersArgs> defenderForServers;

    public Output<DefenderForServersAwsOfferingDefenderForServersArgs> getDefenderForServers() {
        return this.defenderForServers == null ? Output.empty() : this.defenderForServers;
    }

    /**
     * The type of the security offering.
     * Expected value is 'DefenderForServersAWS'.
     * 
     */
    @Import(name="offeringType", required=true)
      private final Output<String> offeringType;

    public Output<String> getOfferingType() {
        return this.offeringType;
    }

    public DefenderForServersAwsOfferingArgs(
        @Nullable Output<DefenderForServersAwsOfferingArcAutoProvisioningArgs> arcAutoProvisioning,
        @Nullable Output<DefenderForServersAwsOfferingDefenderForServersArgs> defenderForServers,
        Output<String> offeringType) {
        this.arcAutoProvisioning = arcAutoProvisioning;
        this.defenderForServers = defenderForServers;
        this.offeringType = Objects.requireNonNull(offeringType, "expected parameter 'offeringType' to be non-null");
    }

    private DefenderForServersAwsOfferingArgs() {
        this.arcAutoProvisioning = Output.empty();
        this.defenderForServers = Output.empty();
        this.offeringType = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DefenderForServersAwsOfferingArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<DefenderForServersAwsOfferingArcAutoProvisioningArgs> arcAutoProvisioning;
        private @Nullable Output<DefenderForServersAwsOfferingDefenderForServersArgs> defenderForServers;
        private Output<String> offeringType;

        public Builder() {
    	      // Empty
        }

        public Builder(DefenderForServersAwsOfferingArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.arcAutoProvisioning = defaults.arcAutoProvisioning;
    	      this.defenderForServers = defaults.defenderForServers;
    	      this.offeringType = defaults.offeringType;
        }

        public Builder arcAutoProvisioning(@Nullable Output<DefenderForServersAwsOfferingArcAutoProvisioningArgs> arcAutoProvisioning) {
            this.arcAutoProvisioning = arcAutoProvisioning;
            return this;
        }

        public Builder arcAutoProvisioning(@Nullable DefenderForServersAwsOfferingArcAutoProvisioningArgs arcAutoProvisioning) {
            this.arcAutoProvisioning = Output.ofNullable(arcAutoProvisioning);
            return this;
        }

        public Builder defenderForServers(@Nullable Output<DefenderForServersAwsOfferingDefenderForServersArgs> defenderForServers) {
            this.defenderForServers = defenderForServers;
            return this;
        }

        public Builder defenderForServers(@Nullable DefenderForServersAwsOfferingDefenderForServersArgs defenderForServers) {
            this.defenderForServers = Output.ofNullable(defenderForServers);
            return this;
        }

        public Builder offeringType(Output<String> offeringType) {
            this.offeringType = Objects.requireNonNull(offeringType);
            return this;
        }

        public Builder offeringType(String offeringType) {
            this.offeringType = Output.of(Objects.requireNonNull(offeringType));
            return this;
        }
        public DefenderForServersAwsOfferingArgs build() {
            return new DefenderForServersAwsOfferingArgs(arcAutoProvisioning, defenderForServers, offeringType);
        }
    }
}
