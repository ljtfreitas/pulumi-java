// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.network.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class SingleQueryResultResponse {
    /**
     * Describes what is the signature enforces
     * 
     */
    private final @Nullable String description;
    /**
     * Describes the list of destination ports related to this signature
     * 
     */
    private final @Nullable List<String> destinationPorts;
    /**
     * Describes in which direction signature is being enforced: 0 - Inbound, 1 - OutBound, 2 - Bidirectional
     * 
     */
    private final @Nullable Integer direction;
    /**
     * Describes the groups the signature belongs to
     * 
     */
    private final @Nullable String group;
    /**
     * Describes if this override is inherited from base policy or not
     * 
     */
    private final @Nullable Boolean inheritedFromParentPolicy;
    /**
     * Describes the last updated time of the signature (provided from 3rd party vendor)
     * 
     */
    private final @Nullable String lastUpdated;
    /**
     * The current mode enforced, 0 - Disabled, 1 - Alert, 2 -Deny
     * 
     */
    private final @Nullable Integer mode;
    /**
     * Describes the protocol the signatures is being enforced in
     * 
     */
    private final @Nullable String protocol;
    /**
     * Describes the severity of signature: 1 - Low, 2 - Medium, 3 - High
     * 
     */
    private final @Nullable Integer severity;
    /**
     * The ID of the signature
     * 
     */
    private final @Nullable Integer signatureId;
    /**
     * Describes the list of source ports related to this signature
     * 
     */
    private final @Nullable List<String> sourcePorts;

    @OutputCustomType.Constructor({"description","destinationPorts","direction","group","inheritedFromParentPolicy","lastUpdated","mode","protocol","severity","signatureId","sourcePorts"})
    private SingleQueryResultResponse(
        @Nullable String description,
        @Nullable List<String> destinationPorts,
        @Nullable Integer direction,
        @Nullable String group,
        @Nullable Boolean inheritedFromParentPolicy,
        @Nullable String lastUpdated,
        @Nullable Integer mode,
        @Nullable String protocol,
        @Nullable Integer severity,
        @Nullable Integer signatureId,
        @Nullable List<String> sourcePorts) {
        this.description = description;
        this.destinationPorts = destinationPorts;
        this.direction = direction;
        this.group = group;
        this.inheritedFromParentPolicy = inheritedFromParentPolicy;
        this.lastUpdated = lastUpdated;
        this.mode = mode;
        this.protocol = protocol;
        this.severity = severity;
        this.signatureId = signatureId;
        this.sourcePorts = sourcePorts;
    }

    /**
     * Describes what is the signature enforces
     * 
     */
    public Optional<String> getDescription() {
        return Optional.ofNullable(this.description);
    }
    /**
     * Describes the list of destination ports related to this signature
     * 
     */
    public List<String> getDestinationPorts() {
        return this.destinationPorts == null ? List.of() : this.destinationPorts;
    }
    /**
     * Describes in which direction signature is being enforced: 0 - Inbound, 1 - OutBound, 2 - Bidirectional
     * 
     */
    public Optional<Integer> getDirection() {
        return Optional.ofNullable(this.direction);
    }
    /**
     * Describes the groups the signature belongs to
     * 
     */
    public Optional<String> getGroup() {
        return Optional.ofNullable(this.group);
    }
    /**
     * Describes if this override is inherited from base policy or not
     * 
     */
    public Optional<Boolean> getInheritedFromParentPolicy() {
        return Optional.ofNullable(this.inheritedFromParentPolicy);
    }
    /**
     * Describes the last updated time of the signature (provided from 3rd party vendor)
     * 
     */
    public Optional<String> getLastUpdated() {
        return Optional.ofNullable(this.lastUpdated);
    }
    /**
     * The current mode enforced, 0 - Disabled, 1 - Alert, 2 -Deny
     * 
     */
    public Optional<Integer> getMode() {
        return Optional.ofNullable(this.mode);
    }
    /**
     * Describes the protocol the signatures is being enforced in
     * 
     */
    public Optional<String> getProtocol() {
        return Optional.ofNullable(this.protocol);
    }
    /**
     * Describes the severity of signature: 1 - Low, 2 - Medium, 3 - High
     * 
     */
    public Optional<Integer> getSeverity() {
        return Optional.ofNullable(this.severity);
    }
    /**
     * The ID of the signature
     * 
     */
    public Optional<Integer> getSignatureId() {
        return Optional.ofNullable(this.signatureId);
    }
    /**
     * Describes the list of source ports related to this signature
     * 
     */
    public List<String> getSourcePorts() {
        return this.sourcePorts == null ? List.of() : this.sourcePorts;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SingleQueryResultResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String description;
        private @Nullable List<String> destinationPorts;
        private @Nullable Integer direction;
        private @Nullable String group;
        private @Nullable Boolean inheritedFromParentPolicy;
        private @Nullable String lastUpdated;
        private @Nullable Integer mode;
        private @Nullable String protocol;
        private @Nullable Integer severity;
        private @Nullable Integer signatureId;
        private @Nullable List<String> sourcePorts;

        public Builder() {
    	      // Empty
        }

        public Builder(SingleQueryResultResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.description = defaults.description;
    	      this.destinationPorts = defaults.destinationPorts;
    	      this.direction = defaults.direction;
    	      this.group = defaults.group;
    	      this.inheritedFromParentPolicy = defaults.inheritedFromParentPolicy;
    	      this.lastUpdated = defaults.lastUpdated;
    	      this.mode = defaults.mode;
    	      this.protocol = defaults.protocol;
    	      this.severity = defaults.severity;
    	      this.signatureId = defaults.signatureId;
    	      this.sourcePorts = defaults.sourcePorts;
        }

        public Builder setDescription(@Nullable String description) {
            this.description = description;
            return this;
        }

        public Builder setDestinationPorts(@Nullable List<String> destinationPorts) {
            this.destinationPorts = destinationPorts;
            return this;
        }

        public Builder setDirection(@Nullable Integer direction) {
            this.direction = direction;
            return this;
        }

        public Builder setGroup(@Nullable String group) {
            this.group = group;
            return this;
        }

        public Builder setInheritedFromParentPolicy(@Nullable Boolean inheritedFromParentPolicy) {
            this.inheritedFromParentPolicy = inheritedFromParentPolicy;
            return this;
        }

        public Builder setLastUpdated(@Nullable String lastUpdated) {
            this.lastUpdated = lastUpdated;
            return this;
        }

        public Builder setMode(@Nullable Integer mode) {
            this.mode = mode;
            return this;
        }

        public Builder setProtocol(@Nullable String protocol) {
            this.protocol = protocol;
            return this;
        }

        public Builder setSeverity(@Nullable Integer severity) {
            this.severity = severity;
            return this;
        }

        public Builder setSignatureId(@Nullable Integer signatureId) {
            this.signatureId = signatureId;
            return this;
        }

        public Builder setSourcePorts(@Nullable List<String> sourcePorts) {
            this.sourcePorts = sourcePorts;
            return this;
        }
        public SingleQueryResultResponse build() {
            return new SingleQueryResultResponse(description, destinationPorts, direction, group, inheritedFromParentPolicy, lastUpdated, mode, protocol, severity, signatureId, sourcePorts);
        }
    }
}
