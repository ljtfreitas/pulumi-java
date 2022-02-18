// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.sql.outputs;

import io.pulumi.azurenative.sql.outputs.ServerInfoResponse;
import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@OutputCustomType
public final class GetServerTrustGroupResult {
    /**
     * Group members information for the server trust group.
     * 
     */
    private final List<ServerInfoResponse> groupMembers;
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
     * Trust scope of the server trust group.
     * 
     */
    private final List<String> trustScopes;
    /**
     * Resource type.
     * 
     */
    private final String type;

    @OutputCustomType.Constructor({"groupMembers","id","name","trustScopes","type"})
    private GetServerTrustGroupResult(
        List<ServerInfoResponse> groupMembers,
        String id,
        String name,
        List<String> trustScopes,
        String type) {
        this.groupMembers = Objects.requireNonNull(groupMembers);
        this.id = Objects.requireNonNull(id);
        this.name = Objects.requireNonNull(name);
        this.trustScopes = Objects.requireNonNull(trustScopes);
        this.type = Objects.requireNonNull(type);
    }

    /**
     * Group members information for the server trust group.
     * 
     */
    public List<ServerInfoResponse> getGroupMembers() {
        return this.groupMembers;
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
     * Trust scope of the server trust group.
     * 
     */
    public List<String> getTrustScopes() {
        return this.trustScopes;
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

    public static Builder builder(GetServerTrustGroupResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private List<ServerInfoResponse> groupMembers;
        private String id;
        private String name;
        private List<String> trustScopes;
        private String type;

        public Builder() {
    	      // Empty
        }

        public Builder(GetServerTrustGroupResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.groupMembers = defaults.groupMembers;
    	      this.id = defaults.id;
    	      this.name = defaults.name;
    	      this.trustScopes = defaults.trustScopes;
    	      this.type = defaults.type;
        }

        public Builder setGroupMembers(List<ServerInfoResponse> groupMembers) {
            this.groupMembers = Objects.requireNonNull(groupMembers);
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

        public Builder setTrustScopes(List<String> trustScopes) {
            this.trustScopes = Objects.requireNonNull(trustScopes);
            return this;
        }

        public Builder setType(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }

        public GetServerTrustGroupResult build() {
            return new GetServerTrustGroupResult(groupMembers, id, name, trustScopes, type);
        }
    }
}
