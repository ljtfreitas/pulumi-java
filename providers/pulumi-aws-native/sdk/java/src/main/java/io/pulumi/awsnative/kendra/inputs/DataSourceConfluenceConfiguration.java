// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.kendra.inputs;

import io.pulumi.awsnative.kendra.enums.DataSourceConfluenceVersion;
import io.pulumi.awsnative.kendra.inputs.DataSourceConfluenceAttachmentConfiguration;
import io.pulumi.awsnative.kendra.inputs.DataSourceConfluenceBlogConfiguration;
import io.pulumi.awsnative.kendra.inputs.DataSourceConfluencePageConfiguration;
import io.pulumi.awsnative.kendra.inputs.DataSourceConfluenceSpaceConfiguration;
import io.pulumi.awsnative.kendra.inputs.DataSourceVpcConfiguration;
import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class DataSourceConfluenceConfiguration extends io.pulumi.resources.InvokeArgs {

    public static final DataSourceConfluenceConfiguration Empty = new DataSourceConfluenceConfiguration();

    @Import(name="attachmentConfiguration")
      private final @Nullable DataSourceConfluenceAttachmentConfiguration attachmentConfiguration;

    public Optional<DataSourceConfluenceAttachmentConfiguration> getAttachmentConfiguration() {
        return this.attachmentConfiguration == null ? Optional.empty() : Optional.ofNullable(this.attachmentConfiguration);
    }

    @Import(name="blogConfiguration")
      private final @Nullable DataSourceConfluenceBlogConfiguration blogConfiguration;

    public Optional<DataSourceConfluenceBlogConfiguration> getBlogConfiguration() {
        return this.blogConfiguration == null ? Optional.empty() : Optional.ofNullable(this.blogConfiguration);
    }

    @Import(name="exclusionPatterns")
      private final @Nullable List<String> exclusionPatterns;

    public List<String> getExclusionPatterns() {
        return this.exclusionPatterns == null ? List.of() : this.exclusionPatterns;
    }

    @Import(name="inclusionPatterns")
      private final @Nullable List<String> inclusionPatterns;

    public List<String> getInclusionPatterns() {
        return this.inclusionPatterns == null ? List.of() : this.inclusionPatterns;
    }

    @Import(name="pageConfiguration")
      private final @Nullable DataSourceConfluencePageConfiguration pageConfiguration;

    public Optional<DataSourceConfluencePageConfiguration> getPageConfiguration() {
        return this.pageConfiguration == null ? Optional.empty() : Optional.ofNullable(this.pageConfiguration);
    }

    @Import(name="secretArn", required=true)
      private final String secretArn;

    public String getSecretArn() {
        return this.secretArn;
    }

    @Import(name="serverUrl", required=true)
      private final String serverUrl;

    public String getServerUrl() {
        return this.serverUrl;
    }

    @Import(name="spaceConfiguration")
      private final @Nullable DataSourceConfluenceSpaceConfiguration spaceConfiguration;

    public Optional<DataSourceConfluenceSpaceConfiguration> getSpaceConfiguration() {
        return this.spaceConfiguration == null ? Optional.empty() : Optional.ofNullable(this.spaceConfiguration);
    }

    @Import(name="version", required=true)
      private final DataSourceConfluenceVersion version;

    public DataSourceConfluenceVersion getVersion() {
        return this.version;
    }

    @Import(name="vpcConfiguration")
      private final @Nullable DataSourceVpcConfiguration vpcConfiguration;

    public Optional<DataSourceVpcConfiguration> getVpcConfiguration() {
        return this.vpcConfiguration == null ? Optional.empty() : Optional.ofNullable(this.vpcConfiguration);
    }

    public DataSourceConfluenceConfiguration(
        @Nullable DataSourceConfluenceAttachmentConfiguration attachmentConfiguration,
        @Nullable DataSourceConfluenceBlogConfiguration blogConfiguration,
        @Nullable List<String> exclusionPatterns,
        @Nullable List<String> inclusionPatterns,
        @Nullable DataSourceConfluencePageConfiguration pageConfiguration,
        String secretArn,
        String serverUrl,
        @Nullable DataSourceConfluenceSpaceConfiguration spaceConfiguration,
        DataSourceConfluenceVersion version,
        @Nullable DataSourceVpcConfiguration vpcConfiguration) {
        this.attachmentConfiguration = attachmentConfiguration;
        this.blogConfiguration = blogConfiguration;
        this.exclusionPatterns = exclusionPatterns;
        this.inclusionPatterns = inclusionPatterns;
        this.pageConfiguration = pageConfiguration;
        this.secretArn = Objects.requireNonNull(secretArn, "expected parameter 'secretArn' to be non-null");
        this.serverUrl = Objects.requireNonNull(serverUrl, "expected parameter 'serverUrl' to be non-null");
        this.spaceConfiguration = spaceConfiguration;
        this.version = Objects.requireNonNull(version, "expected parameter 'version' to be non-null");
        this.vpcConfiguration = vpcConfiguration;
    }

    private DataSourceConfluenceConfiguration() {
        this.attachmentConfiguration = null;
        this.blogConfiguration = null;
        this.exclusionPatterns = List.of();
        this.inclusionPatterns = List.of();
        this.pageConfiguration = null;
        this.secretArn = null;
        this.serverUrl = null;
        this.spaceConfiguration = null;
        this.version = null;
        this.vpcConfiguration = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DataSourceConfluenceConfiguration defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable DataSourceConfluenceAttachmentConfiguration attachmentConfiguration;
        private @Nullable DataSourceConfluenceBlogConfiguration blogConfiguration;
        private @Nullable List<String> exclusionPatterns;
        private @Nullable List<String> inclusionPatterns;
        private @Nullable DataSourceConfluencePageConfiguration pageConfiguration;
        private String secretArn;
        private String serverUrl;
        private @Nullable DataSourceConfluenceSpaceConfiguration spaceConfiguration;
        private DataSourceConfluenceVersion version;
        private @Nullable DataSourceVpcConfiguration vpcConfiguration;

        public Builder() {
    	      // Empty
        }

        public Builder(DataSourceConfluenceConfiguration defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.attachmentConfiguration = defaults.attachmentConfiguration;
    	      this.blogConfiguration = defaults.blogConfiguration;
    	      this.exclusionPatterns = defaults.exclusionPatterns;
    	      this.inclusionPatterns = defaults.inclusionPatterns;
    	      this.pageConfiguration = defaults.pageConfiguration;
    	      this.secretArn = defaults.secretArn;
    	      this.serverUrl = defaults.serverUrl;
    	      this.spaceConfiguration = defaults.spaceConfiguration;
    	      this.version = defaults.version;
    	      this.vpcConfiguration = defaults.vpcConfiguration;
        }

        public Builder attachmentConfiguration(@Nullable DataSourceConfluenceAttachmentConfiguration attachmentConfiguration) {
            this.attachmentConfiguration = attachmentConfiguration;
            return this;
        }

        public Builder blogConfiguration(@Nullable DataSourceConfluenceBlogConfiguration blogConfiguration) {
            this.blogConfiguration = blogConfiguration;
            return this;
        }

        public Builder exclusionPatterns(@Nullable List<String> exclusionPatterns) {
            this.exclusionPatterns = exclusionPatterns;
            return this;
        }

        public Builder inclusionPatterns(@Nullable List<String> inclusionPatterns) {
            this.inclusionPatterns = inclusionPatterns;
            return this;
        }

        public Builder pageConfiguration(@Nullable DataSourceConfluencePageConfiguration pageConfiguration) {
            this.pageConfiguration = pageConfiguration;
            return this;
        }

        public Builder secretArn(String secretArn) {
            this.secretArn = Objects.requireNonNull(secretArn);
            return this;
        }

        public Builder serverUrl(String serverUrl) {
            this.serverUrl = Objects.requireNonNull(serverUrl);
            return this;
        }

        public Builder spaceConfiguration(@Nullable DataSourceConfluenceSpaceConfiguration spaceConfiguration) {
            this.spaceConfiguration = spaceConfiguration;
            return this;
        }

        public Builder version(DataSourceConfluenceVersion version) {
            this.version = Objects.requireNonNull(version);
            return this;
        }

        public Builder vpcConfiguration(@Nullable DataSourceVpcConfiguration vpcConfiguration) {
            this.vpcConfiguration = vpcConfiguration;
            return this;
        }
        public DataSourceConfluenceConfiguration build() {
            return new DataSourceConfluenceConfiguration(attachmentConfiguration, blogConfiguration, exclusionPatterns, inclusionPatterns, pageConfiguration, secretArn, serverUrl, spaceConfiguration, version, vpcConfiguration);
        }
    }
}
