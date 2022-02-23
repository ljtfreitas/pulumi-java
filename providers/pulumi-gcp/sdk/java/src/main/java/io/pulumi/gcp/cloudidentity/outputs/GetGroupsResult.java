// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.cloudidentity.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import io.pulumi.gcp.cloudidentity.outputs.GetGroupsGroup;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@OutputCustomType
public final class GetGroupsResult {
    /**
     * The list of groups under the provided customer or namespace. Structure is documented below.
     * 
     */
    private final List<GetGroupsGroup> groups;
    /**
     * The provider-assigned unique ID for this managed resource.
     * 
     */
    private final String id;
    private final String parent;

    @OutputCustomType.Constructor({"groups","id","parent"})
    private GetGroupsResult(
        List<GetGroupsGroup> groups,
        String id,
        String parent) {
        this.groups = Objects.requireNonNull(groups);
        this.id = Objects.requireNonNull(id);
        this.parent = Objects.requireNonNull(parent);
    }

    /**
     * The list of groups under the provided customer or namespace. Structure is documented below.
     * 
     */
    public List<GetGroupsGroup> getGroups() {
        return this.groups;
    }
    /**
     * The provider-assigned unique ID for this managed resource.
     * 
     */
    public String getId() {
        return this.id;
    }
    public String getParent() {
        return this.parent;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetGroupsResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private List<GetGroupsGroup> groups;
        private String id;
        private String parent;

        public Builder() {
    	      // Empty
        }

        public Builder(GetGroupsResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.groups = defaults.groups;
    	      this.id = defaults.id;
    	      this.parent = defaults.parent;
        }

        public Builder setGroups(List<GetGroupsGroup> groups) {
            this.groups = Objects.requireNonNull(groups);
            return this;
        }

        public Builder setId(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }

        public Builder setParent(String parent) {
            this.parent = Objects.requireNonNull(parent);
            return this;
        }
        public GetGroupsResult build() {
            return new GetGroupsResult(groups, id, parent);
        }
    }
}
