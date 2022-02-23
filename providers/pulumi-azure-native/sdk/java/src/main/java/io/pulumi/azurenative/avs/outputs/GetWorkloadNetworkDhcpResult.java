// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.avs.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.Double;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class GetWorkloadNetworkDhcpResult {
    /**
     * Type of DHCP: SERVER or RELAY.
     * 
     */
    private final String dhcpType;
    /**
     * Display name of the DHCP entity.
     * 
     */
    private final @Nullable String displayName;
    /**
     * Resource ID.
     * 
     */
    private final String id;
    /**
     * Resource name.
     * 
     */
    private final String name;
    /**
     * The provisioning state
     * 
     */
    private final String provisioningState;
    /**
     * NSX revision number.
     * 
     */
    private final @Nullable Double revision;
    /**
     * NSX Segments consuming DHCP.
     * 
     */
    private final List<String> segments;
    /**
     * Resource type.
     * 
     */
    private final String type;

    @OutputCustomType.Constructor({"dhcpType","displayName","id","name","provisioningState","revision","segments","type"})
    private GetWorkloadNetworkDhcpResult(
        String dhcpType,
        @Nullable String displayName,
        String id,
        String name,
        String provisioningState,
        @Nullable Double revision,
        List<String> segments,
        String type) {
        this.dhcpType = Objects.requireNonNull(dhcpType);
        this.displayName = displayName;
        this.id = Objects.requireNonNull(id);
        this.name = Objects.requireNonNull(name);
        this.provisioningState = Objects.requireNonNull(provisioningState);
        this.revision = revision;
        this.segments = Objects.requireNonNull(segments);
        this.type = Objects.requireNonNull(type);
    }

    /**
     * Type of DHCP: SERVER or RELAY.
     * 
     */
    public String getDhcpType() {
        return this.dhcpType;
    }
    /**
     * Display name of the DHCP entity.
     * 
     */
    public Optional<String> getDisplayName() {
        return Optional.ofNullable(this.displayName);
    }
    /**
     * Resource ID.
     * 
     */
    public String getId() {
        return this.id;
    }
    /**
     * Resource name.
     * 
     */
    public String getName() {
        return this.name;
    }
    /**
     * The provisioning state
     * 
     */
    public String getProvisioningState() {
        return this.provisioningState;
    }
    /**
     * NSX revision number.
     * 
     */
    public Optional<Double> getRevision() {
        return Optional.ofNullable(this.revision);
    }
    /**
     * NSX Segments consuming DHCP.
     * 
     */
    public List<String> getSegments() {
        return this.segments;
    }
    /**
     * Resource type.
     * 
     */
    public String getType() {
        return this.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetWorkloadNetworkDhcpResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String dhcpType;
        private @Nullable String displayName;
        private String id;
        private String name;
        private String provisioningState;
        private @Nullable Double revision;
        private List<String> segments;
        private String type;

        public Builder() {
    	      // Empty
        }

        public Builder(GetWorkloadNetworkDhcpResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.dhcpType = defaults.dhcpType;
    	      this.displayName = defaults.displayName;
    	      this.id = defaults.id;
    	      this.name = defaults.name;
    	      this.provisioningState = defaults.provisioningState;
    	      this.revision = defaults.revision;
    	      this.segments = defaults.segments;
    	      this.type = defaults.type;
        }

        public Builder setDhcpType(String dhcpType) {
            this.dhcpType = Objects.requireNonNull(dhcpType);
            return this;
        }

        public Builder setDisplayName(@Nullable String displayName) {
            this.displayName = displayName;
            return this;
        }

        public Builder setId(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }

        public Builder setName(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }

        public Builder setProvisioningState(String provisioningState) {
            this.provisioningState = Objects.requireNonNull(provisioningState);
            return this;
        }

        public Builder setRevision(@Nullable Double revision) {
            this.revision = revision;
            return this;
        }

        public Builder setSegments(List<String> segments) {
            this.segments = Objects.requireNonNull(segments);
            return this;
        }

        public Builder setType(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }
        public GetWorkloadNetworkDhcpResult build() {
            return new GetWorkloadNetworkDhcpResult(dhcpType, displayName, id, name, provisioningState, revision, segments, type);
        }
    }
}
