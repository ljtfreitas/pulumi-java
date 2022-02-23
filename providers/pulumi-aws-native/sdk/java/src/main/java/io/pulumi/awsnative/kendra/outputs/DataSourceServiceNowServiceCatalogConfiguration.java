// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.kendra.outputs;

import io.pulumi.awsnative.kendra.outputs.DataSourceToIndexFieldMapping;
import io.pulumi.core.annotations.OutputCustomType;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class DataSourceServiceNowServiceCatalogConfiguration {
    private final @Nullable Boolean crawlAttachments;
    private final String documentDataFieldName;
    private final @Nullable String documentTitleFieldName;
    private final @Nullable List<String> excludeAttachmentFilePatterns;
    private final @Nullable List<DataSourceToIndexFieldMapping> fieldMappings;
    private final @Nullable List<String> includeAttachmentFilePatterns;

    @OutputCustomType.Constructor({"crawlAttachments","documentDataFieldName","documentTitleFieldName","excludeAttachmentFilePatterns","fieldMappings","includeAttachmentFilePatterns"})
    private DataSourceServiceNowServiceCatalogConfiguration(
        @Nullable Boolean crawlAttachments,
        String documentDataFieldName,
        @Nullable String documentTitleFieldName,
        @Nullable List<String> excludeAttachmentFilePatterns,
        @Nullable List<DataSourceToIndexFieldMapping> fieldMappings,
        @Nullable List<String> includeAttachmentFilePatterns) {
        this.crawlAttachments = crawlAttachments;
        this.documentDataFieldName = Objects.requireNonNull(documentDataFieldName);
        this.documentTitleFieldName = documentTitleFieldName;
        this.excludeAttachmentFilePatterns = excludeAttachmentFilePatterns;
        this.fieldMappings = fieldMappings;
        this.includeAttachmentFilePatterns = includeAttachmentFilePatterns;
    }

    public Optional<Boolean> getCrawlAttachments() {
        return Optional.ofNullable(this.crawlAttachments);
    }
    public String getDocumentDataFieldName() {
        return this.documentDataFieldName;
    }
    public Optional<String> getDocumentTitleFieldName() {
        return Optional.ofNullable(this.documentTitleFieldName);
    }
    public List<String> getExcludeAttachmentFilePatterns() {
        return this.excludeAttachmentFilePatterns == null ? List.of() : this.excludeAttachmentFilePatterns;
    }
    public List<DataSourceToIndexFieldMapping> getFieldMappings() {
        return this.fieldMappings == null ? List.of() : this.fieldMappings;
    }
    public List<String> getIncludeAttachmentFilePatterns() {
        return this.includeAttachmentFilePatterns == null ? List.of() : this.includeAttachmentFilePatterns;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DataSourceServiceNowServiceCatalogConfiguration defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Boolean crawlAttachments;
        private String documentDataFieldName;
        private @Nullable String documentTitleFieldName;
        private @Nullable List<String> excludeAttachmentFilePatterns;
        private @Nullable List<DataSourceToIndexFieldMapping> fieldMappings;
        private @Nullable List<String> includeAttachmentFilePatterns;

        public Builder() {
    	      // Empty
        }

        public Builder(DataSourceServiceNowServiceCatalogConfiguration defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.crawlAttachments = defaults.crawlAttachments;
    	      this.documentDataFieldName = defaults.documentDataFieldName;
    	      this.documentTitleFieldName = defaults.documentTitleFieldName;
    	      this.excludeAttachmentFilePatterns = defaults.excludeAttachmentFilePatterns;
    	      this.fieldMappings = defaults.fieldMappings;
    	      this.includeAttachmentFilePatterns = defaults.includeAttachmentFilePatterns;
        }

        public Builder setCrawlAttachments(@Nullable Boolean crawlAttachments) {
            this.crawlAttachments = crawlAttachments;
            return this;
        }

        public Builder setDocumentDataFieldName(String documentDataFieldName) {
            this.documentDataFieldName = Objects.requireNonNull(documentDataFieldName);
            return this;
        }

        public Builder setDocumentTitleFieldName(@Nullable String documentTitleFieldName) {
            this.documentTitleFieldName = documentTitleFieldName;
            return this;
        }

        public Builder setExcludeAttachmentFilePatterns(@Nullable List<String> excludeAttachmentFilePatterns) {
            this.excludeAttachmentFilePatterns = excludeAttachmentFilePatterns;
            return this;
        }

        public Builder setFieldMappings(@Nullable List<DataSourceToIndexFieldMapping> fieldMappings) {
            this.fieldMappings = fieldMappings;
            return this;
        }

        public Builder setIncludeAttachmentFilePatterns(@Nullable List<String> includeAttachmentFilePatterns) {
            this.includeAttachmentFilePatterns = includeAttachmentFilePatterns;
            return this;
        }
        public DataSourceServiceNowServiceCatalogConfiguration build() {
            return new DataSourceServiceNowServiceCatalogConfiguration(crawlAttachments, documentDataFieldName, documentTitleFieldName, excludeAttachmentFilePatterns, fieldMappings, includeAttachmentFilePatterns);
        }
    }
}
