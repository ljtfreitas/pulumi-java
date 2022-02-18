// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.security.inputs;

import io.pulumi.azurenative.security.inputs.DefenderForServersAwsOfferingResponseArcAutoProvisioning;
import io.pulumi.azurenative.security.inputs.DefenderForServersAwsOfferingResponseDefenderForServers;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * The Defender for Servers AWS offering configurations
 * 
 */
public final class DefenderForServersAwsOfferingResponse extends io.pulumi.resources.InvokeArgs {

    public static final DefenderForServersAwsOfferingResponse Empty = new DefenderForServersAwsOfferingResponse();

    /**
     * The ARC autoprovisioning configuration
     * 
     */
    @InputImport(name="arcAutoProvisioning")
    private final @Nullable DefenderForServersAwsOfferingResponseArcAutoProvisioning arcAutoProvisioning;

    public Optional<DefenderForServersAwsOfferingResponseArcAutoProvisioning> getArcAutoProvisioning() {
        return this.arcAutoProvisioning == null ? Optional.empty() : Optional.ofNullable(this.arcAutoProvisioning);
    }

    /**
     * The Defender for servers connection configuration
     * 
     */
    @InputImport(name="defenderForServers")
    private final @Nullable DefenderForServersAwsOfferingResponseDefenderForServers defenderForServers;

    public Optional<DefenderForServersAwsOfferingResponseDefenderForServers> getDefenderForServers() {
        return this.defenderForServers == null ? Optional.empty() : Optional.ofNullable(this.defenderForServers);
    }

    /**
     * The offering description.
     * 
     */
    @InputImport(name="description", required=true)
    private final String description;

    public String getDescription() {
        return this.description;
    }

    /**
     * The type of the security offering.
     * Expected value is 'DefenderForServersAWS'.
     * 
     */
    @InputImport(name="offeringType", required=true)
    private final String offeringType;

    public String getOfferingType() {
        return this.offeringType;
    }

    public DefenderForServersAwsOfferingResponse(
        @Nullable DefenderForServersAwsOfferingResponseArcAutoProvisioning arcAutoProvisioning,
        @Nullable DefenderForServersAwsOfferingResponseDefenderForServers defenderForServers,
        String description,
        String offeringType) {
        this.arcAutoProvisioning = arcAutoProvisioning;
        this.defenderForServers = defenderForServers;
        this.description = Objects.requireNonNull(description, "expected parameter 'description' to be non-null");
        this.offeringType = Objects.requireNonNull(offeringType, "expected parameter 'offeringType' to be non-null");
    }

    private DefenderForServersAwsOfferingResponse() {
        this.arcAutoProvisioning = null;
        this.defenderForServers = null;
        this.description = null;
        this.offeringType = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DefenderForServersAwsOfferingResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable DefenderForServersAwsOfferingResponseArcAutoProvisioning arcAutoProvisioning;
        private @Nullable DefenderForServersAwsOfferingResponseDefenderForServers defenderForServers;
        private String description;
        private String offeringType;

        public Builder() {
    	      // Empty
        }

        public Builder(DefenderForServersAwsOfferingResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.arcAutoProvisioning = defaults.arcAutoProvisioning;
    	      this.defenderForServers = defaults.defenderForServers;
    	      this.description = defaults.description;
    	      this.offeringType = defaults.offeringType;
        }

        public Builder setArcAutoProvisioning(@Nullable DefenderForServersAwsOfferingResponseArcAutoProvisioning arcAutoProvisioning) {
            this.arcAutoProvisioning = arcAutoProvisioning;
            return this;
        }

        public Builder setDefenderForServers(@Nullable DefenderForServersAwsOfferingResponseDefenderForServers defenderForServers) {
            this.defenderForServers = defenderForServers;
            return this;
        }

        public Builder setDescription(String description) {
            this.description = Objects.requireNonNull(description);
            return this;
        }

        public Builder setOfferingType(String offeringType) {
            this.offeringType = Objects.requireNonNull(offeringType);
            return this;
        }

        public DefenderForServersAwsOfferingResponse build() {
            return new DefenderForServersAwsOfferingResponse(arcAutoProvisioning, defenderForServers, description, offeringType);
        }
    }
}
