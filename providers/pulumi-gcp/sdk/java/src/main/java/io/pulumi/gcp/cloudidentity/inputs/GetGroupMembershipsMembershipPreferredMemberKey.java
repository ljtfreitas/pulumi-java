// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.cloudidentity.inputs;

import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class GetGroupMembershipsMembershipPreferredMemberKey extends io.pulumi.resources.InvokeArgs {

    public static final GetGroupMembershipsMembershipPreferredMemberKey Empty = new GetGroupMembershipsMembershipPreferredMemberKey();

    /**
     * The ID of the entity. For Google-managed entities, the id is the email address of an existing
     * group or user. For external-identity-mapped entities, the id is a string conforming
     * to the Identity Source's requirements.
     * 
     */
    @Import(name="id", required=true)
      private final String id;

    public String getId() {
        return this.id;
    }

    /**
     * The namespace in which the entity exists.
     * If not populated, the EntityKey represents a Google-managed entity
     * such as a Google user or a Google Group.
     * If populated, the EntityKey represents an external-identity-mapped group.
     * 
     */
    @Import(name="namespace", required=true)
      private final String namespace;

    public String getNamespace() {
        return this.namespace;
    }

    public GetGroupMembershipsMembershipPreferredMemberKey(
        String id,
        String namespace) {
        this.id = Objects.requireNonNull(id, "expected parameter 'id' to be non-null");
        this.namespace = Objects.requireNonNull(namespace, "expected parameter 'namespace' to be non-null");
    }

    private GetGroupMembershipsMembershipPreferredMemberKey() {
        this.id = null;
        this.namespace = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetGroupMembershipsMembershipPreferredMemberKey defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String id;
        private String namespace;

        public Builder() {
    	      // Empty
        }

        public Builder(GetGroupMembershipsMembershipPreferredMemberKey defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.id = defaults.id;
    	      this.namespace = defaults.namespace;
        }

        public Builder id(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }

        public Builder namespace(String namespace) {
            this.namespace = Objects.requireNonNull(namespace);
            return this;
        }
        public GetGroupMembershipsMembershipPreferredMemberKey build() {
            return new GetGroupMembershipsMembershipPreferredMemberKey(id, namespace);
        }
    }
}
