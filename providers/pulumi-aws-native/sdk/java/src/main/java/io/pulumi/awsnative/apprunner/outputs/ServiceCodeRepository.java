// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.apprunner.outputs;

import io.pulumi.awsnative.apprunner.outputs.ServiceCodeConfiguration;
import io.pulumi.awsnative.apprunner.outputs.ServiceSourceCodeVersion;
import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class ServiceCodeRepository {
    private final @Nullable ServiceCodeConfiguration codeConfiguration;
    /**
     * Repository Url
     * 
     */
    private final String repositoryUrl;
    private final ServiceSourceCodeVersion sourceCodeVersion;

    @OutputCustomType.Constructor({"codeConfiguration","repositoryUrl","sourceCodeVersion"})
    private ServiceCodeRepository(
        @Nullable ServiceCodeConfiguration codeConfiguration,
        String repositoryUrl,
        ServiceSourceCodeVersion sourceCodeVersion) {
        this.codeConfiguration = codeConfiguration;
        this.repositoryUrl = Objects.requireNonNull(repositoryUrl);
        this.sourceCodeVersion = Objects.requireNonNull(sourceCodeVersion);
    }

    public Optional<ServiceCodeConfiguration> getCodeConfiguration() {
        return Optional.ofNullable(this.codeConfiguration);
    }
    /**
     * Repository Url
     * 
     */
    public String getRepositoryUrl() {
        return this.repositoryUrl;
    }
    public ServiceSourceCodeVersion getSourceCodeVersion() {
        return this.sourceCodeVersion;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ServiceCodeRepository defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable ServiceCodeConfiguration codeConfiguration;
        private String repositoryUrl;
        private ServiceSourceCodeVersion sourceCodeVersion;

        public Builder() {
    	      // Empty
        }

        public Builder(ServiceCodeRepository defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.codeConfiguration = defaults.codeConfiguration;
    	      this.repositoryUrl = defaults.repositoryUrl;
    	      this.sourceCodeVersion = defaults.sourceCodeVersion;
        }

        public Builder setCodeConfiguration(@Nullable ServiceCodeConfiguration codeConfiguration) {
            this.codeConfiguration = codeConfiguration;
            return this;
        }

        public Builder setRepositoryUrl(String repositoryUrl) {
            this.repositoryUrl = Objects.requireNonNull(repositoryUrl);
            return this;
        }

        public Builder setSourceCodeVersion(ServiceSourceCodeVersion sourceCodeVersion) {
            this.sourceCodeVersion = Objects.requireNonNull(sourceCodeVersion);
            return this;
        }
        public ServiceCodeRepository build() {
            return new ServiceCodeRepository(codeConfiguration, repositoryUrl, sourceCodeVersion);
        }
    }
}
