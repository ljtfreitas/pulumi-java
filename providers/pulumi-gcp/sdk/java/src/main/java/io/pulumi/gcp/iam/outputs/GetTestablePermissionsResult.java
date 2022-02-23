// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.iam.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import io.pulumi.gcp.iam.outputs.GetTestablePermissionsPermission;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class GetTestablePermissionsResult {
    /**
     * The the support level of this permission for custom roles.
     * 
     */
    private final @Nullable String customSupportLevel;
    private final String fullResourceName;
    /**
     * The provider-assigned unique ID for this managed resource.
     * 
     */
    private final String id;
    /**
     * A list of permissions matching the provided input. Structure is defined below.
     * 
     */
    private final List<GetTestablePermissionsPermission> permissions;
    private final @Nullable List<String> stages;

    @OutputCustomType.Constructor({"customSupportLevel","fullResourceName","id","permissions","stages"})
    private GetTestablePermissionsResult(
        @Nullable String customSupportLevel,
        String fullResourceName,
        String id,
        List<GetTestablePermissionsPermission> permissions,
        @Nullable List<String> stages) {
        this.customSupportLevel = customSupportLevel;
        this.fullResourceName = Objects.requireNonNull(fullResourceName);
        this.id = Objects.requireNonNull(id);
        this.permissions = Objects.requireNonNull(permissions);
        this.stages = stages;
    }

    /**
     * The the support level of this permission for custom roles.
     * 
     */
    public Optional<String> getCustomSupportLevel() {
        return Optional.ofNullable(this.customSupportLevel);
    }
    public String getFullResourceName() {
        return this.fullResourceName;
    }
    /**
     * The provider-assigned unique ID for this managed resource.
     * 
     */
    public String getId() {
        return this.id;
    }
    /**
     * A list of permissions matching the provided input. Structure is defined below.
     * 
     */
    public List<GetTestablePermissionsPermission> getPermissions() {
        return this.permissions;
    }
    public List<String> getStages() {
        return this.stages == null ? List.of() : this.stages;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetTestablePermissionsResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String customSupportLevel;
        private String fullResourceName;
        private String id;
        private List<GetTestablePermissionsPermission> permissions;
        private @Nullable List<String> stages;

        public Builder() {
    	      // Empty
        }

        public Builder(GetTestablePermissionsResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.customSupportLevel = defaults.customSupportLevel;
    	      this.fullResourceName = defaults.fullResourceName;
    	      this.id = defaults.id;
    	      this.permissions = defaults.permissions;
    	      this.stages = defaults.stages;
        }

        public Builder setCustomSupportLevel(@Nullable String customSupportLevel) {
            this.customSupportLevel = customSupportLevel;
            return this;
        }

        public Builder setFullResourceName(String fullResourceName) {
            this.fullResourceName = Objects.requireNonNull(fullResourceName);
            return this;
        }

        public Builder setId(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }

        public Builder setPermissions(List<GetTestablePermissionsPermission> permissions) {
            this.permissions = Objects.requireNonNull(permissions);
            return this;
        }

        public Builder setStages(@Nullable List<String> stages) {
            this.stages = stages;
            return this;
        }
        public GetTestablePermissionsResult build() {
            return new GetTestablePermissionsResult(customSupportLevel, fullResourceName, id, permissions, stages);
        }
    }
}
