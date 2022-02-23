// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.kubernetes.apiextensions.k8s.io_v1.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import io.pulumi.kubernetes.apiextensions.k8s.io_v1.outputs.CustomResourceDefinitionCondition;
import io.pulumi.kubernetes.apiextensions.k8s.io_v1.outputs.CustomResourceDefinitionNames;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;

@OutputCustomType
public final class CustomResourceDefinitionStatus {
    /**
     * acceptedNames are the names that are actually being used to serve discovery. They may be different than the names in spec.
     * 
     */
    private final CustomResourceDefinitionNames acceptedNames;
    /**
     * conditions indicate state for particular aspects of a CustomResourceDefinition
     * 
     */
    private final @Nullable List<CustomResourceDefinitionCondition> conditions;
    /**
     * storedVersions lists all versions of CustomResources that were ever persisted. Tracking these versions allows a migration path for stored versions in etcd. The field is mutable so a migration controller can finish a migration to another version (ensuring no old objects are left in storage), and then remove the rest of the versions from this list. Versions may not be removed from `spec.versions` while they exist in this list.
     * 
     */
    private final List<String> storedVersions;

    @OutputCustomType.Constructor({"acceptedNames","conditions","storedVersions"})
    private CustomResourceDefinitionStatus(
        CustomResourceDefinitionNames acceptedNames,
        @Nullable List<CustomResourceDefinitionCondition> conditions,
        List<String> storedVersions) {
        this.acceptedNames = Objects.requireNonNull(acceptedNames);
        this.conditions = conditions;
        this.storedVersions = Objects.requireNonNull(storedVersions);
    }

    /**
     * acceptedNames are the names that are actually being used to serve discovery. They may be different than the names in spec.
     * 
     */
    public CustomResourceDefinitionNames getAcceptedNames() {
        return this.acceptedNames;
    }
    /**
     * conditions indicate state for particular aspects of a CustomResourceDefinition
     * 
     */
    public List<CustomResourceDefinitionCondition> getConditions() {
        return this.conditions == null ? List.of() : this.conditions;
    }
    /**
     * storedVersions lists all versions of CustomResources that were ever persisted. Tracking these versions allows a migration path for stored versions in etcd. The field is mutable so a migration controller can finish a migration to another version (ensuring no old objects are left in storage), and then remove the rest of the versions from this list. Versions may not be removed from `spec.versions` while they exist in this list.
     * 
     */
    public List<String> getStoredVersions() {
        return this.storedVersions;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(CustomResourceDefinitionStatus defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private CustomResourceDefinitionNames acceptedNames;
        private @Nullable List<CustomResourceDefinitionCondition> conditions;
        private List<String> storedVersions;

        public Builder() {
    	      // Empty
        }

        public Builder(CustomResourceDefinitionStatus defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.acceptedNames = defaults.acceptedNames;
    	      this.conditions = defaults.conditions;
    	      this.storedVersions = defaults.storedVersions;
        }

        public Builder setAcceptedNames(CustomResourceDefinitionNames acceptedNames) {
            this.acceptedNames = Objects.requireNonNull(acceptedNames);
            return this;
        }

        public Builder setConditions(@Nullable List<CustomResourceDefinitionCondition> conditions) {
            this.conditions = conditions;
            return this;
        }

        public Builder setStoredVersions(List<String> storedVersions) {
            this.storedVersions = Objects.requireNonNull(storedVersions);
            return this;
        }
        public CustomResourceDefinitionStatus build() {
            return new CustomResourceDefinitionStatus(acceptedNames, conditions, storedVersions);
        }
    }
}
