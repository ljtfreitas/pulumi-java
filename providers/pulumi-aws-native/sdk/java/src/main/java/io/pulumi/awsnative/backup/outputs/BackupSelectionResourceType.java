// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.backup.outputs;

import io.pulumi.awsnative.backup.outputs.BackupSelectionConditionResourceType;
import io.pulumi.awsnative.backup.outputs.BackupSelectionResourceTypeConditionsProperties;
import io.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class BackupSelectionResourceType {
    private final @Nullable BackupSelectionResourceTypeConditionsProperties conditions;
    private final String iamRoleArn;
    private final @Nullable List<BackupSelectionConditionResourceType> listOfTags;
    private final @Nullable List<String> notResources;
    private final @Nullable List<String> resources;
    private final String selectionName;

    @CustomType.Constructor
    private BackupSelectionResourceType(
        @CustomType.Parameter("conditions") @Nullable BackupSelectionResourceTypeConditionsProperties conditions,
        @CustomType.Parameter("iamRoleArn") String iamRoleArn,
        @CustomType.Parameter("listOfTags") @Nullable List<BackupSelectionConditionResourceType> listOfTags,
        @CustomType.Parameter("notResources") @Nullable List<String> notResources,
        @CustomType.Parameter("resources") @Nullable List<String> resources,
        @CustomType.Parameter("selectionName") String selectionName) {
        this.conditions = conditions;
        this.iamRoleArn = iamRoleArn;
        this.listOfTags = listOfTags;
        this.notResources = notResources;
        this.resources = resources;
        this.selectionName = selectionName;
    }

    public Optional<BackupSelectionResourceTypeConditionsProperties> getConditions() {
        return Optional.ofNullable(this.conditions);
    }
    public String getIamRoleArn() {
        return this.iamRoleArn;
    }
    public List<BackupSelectionConditionResourceType> getListOfTags() {
        return this.listOfTags == null ? List.of() : this.listOfTags;
    }
    public List<String> getNotResources() {
        return this.notResources == null ? List.of() : this.notResources;
    }
    public List<String> getResources() {
        return this.resources == null ? List.of() : this.resources;
    }
    public String getSelectionName() {
        return this.selectionName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(BackupSelectionResourceType defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable BackupSelectionResourceTypeConditionsProperties conditions;
        private String iamRoleArn;
        private @Nullable List<BackupSelectionConditionResourceType> listOfTags;
        private @Nullable List<String> notResources;
        private @Nullable List<String> resources;
        private String selectionName;

        public Builder() {
    	      // Empty
        }

        public Builder(BackupSelectionResourceType defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.conditions = defaults.conditions;
    	      this.iamRoleArn = defaults.iamRoleArn;
    	      this.listOfTags = defaults.listOfTags;
    	      this.notResources = defaults.notResources;
    	      this.resources = defaults.resources;
    	      this.selectionName = defaults.selectionName;
        }

        public Builder conditions(@Nullable BackupSelectionResourceTypeConditionsProperties conditions) {
            this.conditions = conditions;
            return this;
        }

        public Builder iamRoleArn(String iamRoleArn) {
            this.iamRoleArn = Objects.requireNonNull(iamRoleArn);
            return this;
        }

        public Builder listOfTags(@Nullable List<BackupSelectionConditionResourceType> listOfTags) {
            this.listOfTags = listOfTags;
            return this;
        }

        public Builder notResources(@Nullable List<String> notResources) {
            this.notResources = notResources;
            return this;
        }

        public Builder resources(@Nullable List<String> resources) {
            this.resources = resources;
            return this;
        }

        public Builder selectionName(String selectionName) {
            this.selectionName = Objects.requireNonNull(selectionName);
            return this;
        }
        public BackupSelectionResourceType build() {
            return new BackupSelectionResourceType(conditions, iamRoleArn, listOfTags, notResources, resources, selectionName);
        }
    }
}
