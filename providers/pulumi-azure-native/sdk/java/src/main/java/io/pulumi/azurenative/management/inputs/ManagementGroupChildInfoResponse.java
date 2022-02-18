// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.management.inputs;

import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * The child information of a management group.
 * 
 */
public final class ManagementGroupChildInfoResponse extends io.pulumi.resources.InvokeArgs {

    public static final ManagementGroupChildInfoResponse Empty = new ManagementGroupChildInfoResponse();

    /**
     * The list of children.
     * 
     */
    @InputImport(name="children")
    private final @Nullable List<ManagementGroupChildInfoResponse> children;

    public List<ManagementGroupChildInfoResponse> getChildren() {
        return this.children == null ? List.of() : this.children;
    }

    /**
     * The friendly name of the child resource.
     * 
     */
    @InputImport(name="displayName")
    private final @Nullable String displayName;

    public Optional<String> getDisplayName() {
        return this.displayName == null ? Optional.empty() : Optional.ofNullable(this.displayName);
    }

    /**
     * The fully qualified ID for the child resource (management group or subscription).  For example, /providers/Microsoft.Management/managementGroups/0000000-0000-0000-0000-000000000000
     * 
     */
    @InputImport(name="id")
    private final @Nullable String id;

    public Optional<String> getId() {
        return this.id == null ? Optional.empty() : Optional.ofNullable(this.id);
    }

    /**
     * The name of the child entity.
     * 
     */
    @InputImport(name="name")
    private final @Nullable String name;

    public Optional<String> getName() {
        return this.name == null ? Optional.empty() : Optional.ofNullable(this.name);
    }

    /**
     * The fully qualified resource type which includes provider namespace (e.g. Microsoft.Management/managementGroups)
     * 
     */
    @InputImport(name="type")
    private final @Nullable String type;

    public Optional<String> getType() {
        return this.type == null ? Optional.empty() : Optional.ofNullable(this.type);
    }

    public ManagementGroupChildInfoResponse(
        @Nullable List<ManagementGroupChildInfoResponse> children,
        @Nullable String displayName,
        @Nullable String id,
        @Nullable String name,
        @Nullable String type) {
        this.children = children;
        this.displayName = displayName;
        this.id = id;
        this.name = name;
        this.type = type;
    }

    private ManagementGroupChildInfoResponse() {
        this.children = List.of();
        this.displayName = null;
        this.id = null;
        this.name = null;
        this.type = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ManagementGroupChildInfoResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable List<ManagementGroupChildInfoResponse> children;
        private @Nullable String displayName;
        private @Nullable String id;
        private @Nullable String name;
        private @Nullable String type;

        public Builder() {
    	      // Empty
        }

        public Builder(ManagementGroupChildInfoResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.children = defaults.children;
    	      this.displayName = defaults.displayName;
    	      this.id = defaults.id;
    	      this.name = defaults.name;
    	      this.type = defaults.type;
        }

        public Builder setChildren(@Nullable List<ManagementGroupChildInfoResponse> children) {
            this.children = children;
            return this;
        }

        public Builder setDisplayName(@Nullable String displayName) {
            this.displayName = displayName;
            return this;
        }

        public Builder setId(@Nullable String id) {
            this.id = id;
            return this;
        }

        public Builder setName(@Nullable String name) {
            this.name = name;
            return this;
        }

        public Builder setType(@Nullable String type) {
            this.type = type;
            return this;
        }

        public ManagementGroupChildInfoResponse build() {
            return new ManagementGroupChildInfoResponse(children, displayName, id, name, type);
        }
    }
}
