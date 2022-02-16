// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.kendra.outputs;

import io.pulumi.awsnative.kendra.outputs.DataSourceToIndexFieldMapping;
import io.pulumi.core.internal.annotations.OutputCustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;

@OutputCustomType
public final class DataSourceGoogleDriveConfiguration {
    private final @Nullable List<String> excludeMimeTypes;
    private final @Nullable List<String> excludeSharedDrives;
    private final @Nullable List<String> excludeUserAccounts;
    private final @Nullable List<String> exclusionPatterns;
    private final @Nullable List<DataSourceToIndexFieldMapping> fieldMappings;
    private final @Nullable List<String> inclusionPatterns;
    private final String secretArn;

    @OutputCustomType.Constructor({"excludeMimeTypes","excludeSharedDrives","excludeUserAccounts","exclusionPatterns","fieldMappings","inclusionPatterns","secretArn"})
    private DataSourceGoogleDriveConfiguration(
        @Nullable List<String> excludeMimeTypes,
        @Nullable List<String> excludeSharedDrives,
        @Nullable List<String> excludeUserAccounts,
        @Nullable List<String> exclusionPatterns,
        @Nullable List<DataSourceToIndexFieldMapping> fieldMappings,
        @Nullable List<String> inclusionPatterns,
        String secretArn) {
        this.excludeMimeTypes = excludeMimeTypes;
        this.excludeSharedDrives = excludeSharedDrives;
        this.excludeUserAccounts = excludeUserAccounts;
        this.exclusionPatterns = exclusionPatterns;
        this.fieldMappings = fieldMappings;
        this.inclusionPatterns = inclusionPatterns;
        this.secretArn = Objects.requireNonNull(secretArn);
    }

    public List<String> getExcludeMimeTypes() {
        return this.excludeMimeTypes == null ? List.of() : this.excludeMimeTypes;
    }
    public List<String> getExcludeSharedDrives() {
        return this.excludeSharedDrives == null ? List.of() : this.excludeSharedDrives;
    }
    public List<String> getExcludeUserAccounts() {
        return this.excludeUserAccounts == null ? List.of() : this.excludeUserAccounts;
    }
    public List<String> getExclusionPatterns() {
        return this.exclusionPatterns == null ? List.of() : this.exclusionPatterns;
    }
    public List<DataSourceToIndexFieldMapping> getFieldMappings() {
        return this.fieldMappings == null ? List.of() : this.fieldMappings;
    }
    public List<String> getInclusionPatterns() {
        return this.inclusionPatterns == null ? List.of() : this.inclusionPatterns;
    }
    public String getSecretArn() {
        return this.secretArn;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DataSourceGoogleDriveConfiguration defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable List<String> excludeMimeTypes;
        private @Nullable List<String> excludeSharedDrives;
        private @Nullable List<String> excludeUserAccounts;
        private @Nullable List<String> exclusionPatterns;
        private @Nullable List<DataSourceToIndexFieldMapping> fieldMappings;
        private @Nullable List<String> inclusionPatterns;
        private String secretArn;

        public Builder() {
    	      // Empty
        }

        public Builder(DataSourceGoogleDriveConfiguration defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.excludeMimeTypes = defaults.excludeMimeTypes;
    	      this.excludeSharedDrives = defaults.excludeSharedDrives;
    	      this.excludeUserAccounts = defaults.excludeUserAccounts;
    	      this.exclusionPatterns = defaults.exclusionPatterns;
    	      this.fieldMappings = defaults.fieldMappings;
    	      this.inclusionPatterns = defaults.inclusionPatterns;
    	      this.secretArn = defaults.secretArn;
        }

        public Builder setExcludeMimeTypes(@Nullable List<String> excludeMimeTypes) {
            this.excludeMimeTypes = excludeMimeTypes;
            return this;
        }

        public Builder setExcludeSharedDrives(@Nullable List<String> excludeSharedDrives) {
            this.excludeSharedDrives = excludeSharedDrives;
            return this;
        }

        public Builder setExcludeUserAccounts(@Nullable List<String> excludeUserAccounts) {
            this.excludeUserAccounts = excludeUserAccounts;
            return this;
        }

        public Builder setExclusionPatterns(@Nullable List<String> exclusionPatterns) {
            this.exclusionPatterns = exclusionPatterns;
            return this;
        }

        public Builder setFieldMappings(@Nullable List<DataSourceToIndexFieldMapping> fieldMappings) {
            this.fieldMappings = fieldMappings;
            return this;
        }

        public Builder setInclusionPatterns(@Nullable List<String> inclusionPatterns) {
            this.inclusionPatterns = inclusionPatterns;
            return this;
        }

        public Builder setSecretArn(String secretArn) {
            this.secretArn = Objects.requireNonNull(secretArn);
            return this;
        }

        public DataSourceGoogleDriveConfiguration build() {
            return new DataSourceGoogleDriveConfiguration(excludeMimeTypes, excludeSharedDrives, excludeUserAccounts, exclusionPatterns, fieldMappings, inclusionPatterns, secretArn);
        }
    }
}