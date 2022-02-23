// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.accesscontextmanager.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class AccessPolicyState extends io.pulumi.resources.ResourceArgs {

    public static final AccessPolicyState Empty = new AccessPolicyState();

    /**
     * Time the AccessPolicy was created in UTC.
     * 
     */
    @InputImport(name="createTime")
        private final @Nullable Input<String> createTime;

    public Input<String> getCreateTime() {
        return this.createTime == null ? Input.empty() : this.createTime;
    }

    /**
     * Resource name of the AccessPolicy. Format: {policy_id}
     * 
     */
    @InputImport(name="name")
        private final @Nullable Input<String> name;

    public Input<String> getName() {
        return this.name == null ? Input.empty() : this.name;
    }

    /**
     * The parent of this AccessPolicy in the Cloud Resource Hierarchy.
     * Format: organizations/{organization_id}
     * 
     */
    @InputImport(name="parent")
        private final @Nullable Input<String> parent;

    public Input<String> getParent() {
        return this.parent == null ? Input.empty() : this.parent;
    }

    /**
     * Human readable title. Does not affect behavior.
     * 
     */
    @InputImport(name="title")
        private final @Nullable Input<String> title;

    public Input<String> getTitle() {
        return this.title == null ? Input.empty() : this.title;
    }

    /**
     * Time the AccessPolicy was updated in UTC.
     * 
     */
    @InputImport(name="updateTime")
        private final @Nullable Input<String> updateTime;

    public Input<String> getUpdateTime() {
        return this.updateTime == null ? Input.empty() : this.updateTime;
    }

    public AccessPolicyState(
        @Nullable Input<String> createTime,
        @Nullable Input<String> name,
        @Nullable Input<String> parent,
        @Nullable Input<String> title,
        @Nullable Input<String> updateTime) {
        this.createTime = createTime;
        this.name = name;
        this.parent = parent;
        this.title = title;
        this.updateTime = updateTime;
    }

    private AccessPolicyState() {
        this.createTime = Input.empty();
        this.name = Input.empty();
        this.parent = Input.empty();
        this.title = Input.empty();
        this.updateTime = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AccessPolicyState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> createTime;
        private @Nullable Input<String> name;
        private @Nullable Input<String> parent;
        private @Nullable Input<String> title;
        private @Nullable Input<String> updateTime;

        public Builder() {
    	      // Empty
        }

        public Builder(AccessPolicyState defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.createTime = defaults.createTime;
    	      this.name = defaults.name;
    	      this.parent = defaults.parent;
    	      this.title = defaults.title;
    	      this.updateTime = defaults.updateTime;
        }

        public Builder setCreateTime(@Nullable Input<String> createTime) {
            this.createTime = createTime;
            return this;
        }

        public Builder setCreateTime(@Nullable String createTime) {
            this.createTime = Input.ofNullable(createTime);
            return this;
        }

        public Builder setName(@Nullable Input<String> name) {
            this.name = name;
            return this;
        }

        public Builder setName(@Nullable String name) {
            this.name = Input.ofNullable(name);
            return this;
        }

        public Builder setParent(@Nullable Input<String> parent) {
            this.parent = parent;
            return this;
        }

        public Builder setParent(@Nullable String parent) {
            this.parent = Input.ofNullable(parent);
            return this;
        }

        public Builder setTitle(@Nullable Input<String> title) {
            this.title = title;
            return this;
        }

        public Builder setTitle(@Nullable String title) {
            this.title = Input.ofNullable(title);
            return this;
        }

        public Builder setUpdateTime(@Nullable Input<String> updateTime) {
            this.updateTime = updateTime;
            return this;
        }

        public Builder setUpdateTime(@Nullable String updateTime) {
            this.updateTime = Input.ofNullable(updateTime);
            return this;
        }
        public AccessPolicyState build() {
            return new AccessPolicyState(createTime, name, parent, title, updateTime);
        }
    }
}
