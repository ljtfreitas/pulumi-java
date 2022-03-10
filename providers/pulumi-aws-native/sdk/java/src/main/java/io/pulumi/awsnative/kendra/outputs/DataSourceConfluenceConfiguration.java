// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.kendra.outputs;

import io.pulumi.awsnative.kendra.enums.DataSourceConfluenceVersion;
import io.pulumi.awsnative.kendra.outputs.DataSourceConfluenceAttachmentConfiguration;
import io.pulumi.awsnative.kendra.outputs.DataSourceConfluenceBlogConfiguration;
import io.pulumi.awsnative.kendra.outputs.DataSourceConfluencePageConfiguration;
import io.pulumi.awsnative.kendra.outputs.DataSourceConfluenceSpaceConfiguration;
import io.pulumi.awsnative.kendra.outputs.DataSourceVpcConfiguration;
import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class DataSourceConfluenceConfiguration {
    private final @Nullable DataSourceConfluenceAttachmentConfiguration attachmentConfiguration;
    private final @Nullable DataSourceConfluenceBlogConfiguration blogConfiguration;
    private final @Nullable List<String> exclusionPatterns;
    private final @Nullable List<String> inclusionPatterns;
    private final @Nullable DataSourceConfluencePageConfiguration pageConfiguration;
    private final String secretArn;
    private final String serverUrl;
    private final @Nullable DataSourceConfluenceSpaceConfiguration spaceConfiguration;
    private final DataSourceConfluenceVersion version;
    private final @Nullable DataSourceVpcConfiguration vpcConfiguration;

    @OutputCustomType.Constructor
    private DataSourceConfluenceConfiguration(
        @OutputCustomType.Parameter("attachmentConfiguration") @Nullable DataSourceConfluenceAttachmentConfiguration attachmentConfiguration,
        @OutputCustomType.Parameter("blogConfiguration") @Nullable DataSourceConfluenceBlogConfiguration blogConfiguration,
        @OutputCustomType.Parameter("exclusionPatterns") @Nullable List<String> exclusionPatterns,
        @OutputCustomType.Parameter("inclusionPatterns") @Nullable List<String> inclusionPatterns,
        @OutputCustomType.Parameter("pageConfiguration") @Nullable DataSourceConfluencePageConfiguration pageConfiguration,
        @OutputCustomType.Parameter("secretArn") String secretArn,
        @OutputCustomType.Parameter("serverUrl") String serverUrl,
        @OutputCustomType.Parameter("spaceConfiguration") @Nullable DataSourceConfluenceSpaceConfiguration spaceConfiguration,
        @OutputCustomType.Parameter("version") DataSourceConfluenceVersion version,
        @OutputCustomType.Parameter("vpcConfiguration") @Nullable DataSourceVpcConfiguration vpcConfiguration) {
        this.attachmentConfiguration = attachmentConfiguration;
        this.blogConfiguration = blogConfiguration;
        this.exclusionPatterns = exclusionPatterns;
        this.inclusionPatterns = inclusionPatterns;
        this.pageConfiguration = pageConfiguration;
        this.secretArn = secretArn;
        this.serverUrl = serverUrl;
        this.spaceConfiguration = spaceConfiguration;
        this.version = version;
        this.vpcConfiguration = vpcConfiguration;
    }

    public Optional<DataSourceConfluenceAttachmentConfiguration> getAttachmentConfiguration() {
        return Optional.ofNullable(this.attachmentConfiguration);
    }
    public Optional<DataSourceConfluenceBlogConfiguration> getBlogConfiguration() {
        return Optional.ofNullable(this.blogConfiguration);
    }
    public List<String> getExclusionPatterns() {
        return this.exclusionPatterns == null ? List.of() : this.exclusionPatterns;
    }
    public List<String> getInclusionPatterns() {
        return this.inclusionPatterns == null ? List.of() : this.inclusionPatterns;
    }
    public Optional<DataSourceConfluencePageConfiguration> getPageConfiguration() {
        return Optional.ofNullable(this.pageConfiguration);
    }
    public String getSecretArn() {
        return this.secretArn;
    }
    public String getServerUrl() {
        return this.serverUrl;
    }
    public Optional<DataSourceConfluenceSpaceConfiguration> getSpaceConfiguration() {
        return Optional.ofNullable(this.spaceConfiguration);
    }
    public DataSourceConfluenceVersion getVersion() {
        return this.version;
    }
    public Optional<DataSourceVpcConfiguration> getVpcConfiguration() {
        return Optional.ofNullable(this.vpcConfiguration);
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

        public Builder setAttachmentConfiguration(@Nullable DataSourceConfluenceAttachmentConfiguration attachmentConfiguration) {
            this.attachmentConfiguration = attachmentConfiguration;
            return this;
        }

        public Builder setBlogConfiguration(@Nullable DataSourceConfluenceBlogConfiguration blogConfiguration) {
            this.blogConfiguration = blogConfiguration;
            return this;
        }

        public Builder setExclusionPatterns(@Nullable List<String> exclusionPatterns) {
            this.exclusionPatterns = exclusionPatterns;
            return this;
        }

        public Builder setInclusionPatterns(@Nullable List<String> inclusionPatterns) {
            this.inclusionPatterns = inclusionPatterns;
            return this;
        }

        public Builder setPageConfiguration(@Nullable DataSourceConfluencePageConfiguration pageConfiguration) {
            this.pageConfiguration = pageConfiguration;
            return this;
        }

        public Builder setSecretArn(String secretArn) {
            this.secretArn = Objects.requireNonNull(secretArn);
            return this;
        }

        public Builder setServerUrl(String serverUrl) {
            this.serverUrl = Objects.requireNonNull(serverUrl);
            return this;
        }

        public Builder setSpaceConfiguration(@Nullable DataSourceConfluenceSpaceConfiguration spaceConfiguration) {
            this.spaceConfiguration = spaceConfiguration;
            return this;
        }

        public Builder setVersion(DataSourceConfluenceVersion version) {
            this.version = Objects.requireNonNull(version);
            return this;
        }

        public Builder setVpcConfiguration(@Nullable DataSourceVpcConfiguration vpcConfiguration) {
            this.vpcConfiguration = vpcConfiguration;
            return this;
        }
        public DataSourceConfluenceConfiguration build() {
            return new DataSourceConfluenceConfiguration(attachmentConfiguration, blogConfiguration, exclusionPatterns, inclusionPatterns, pageConfiguration, secretArn, serverUrl, spaceConfiguration, version, vpcConfiguration);
        }
    }
}
