// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.datafactory.outputs;

import io.pulumi.azurenative.datafactory.outputs.AzureKeyVaultSecretReferenceResponse;
import io.pulumi.azurenative.datafactory.outputs.SSISAccessCredentialResponse;
import io.pulumi.azurenative.datafactory.outputs.SSISChildPackageResponse;
import io.pulumi.azurenative.datafactory.outputs.SecureStringResponse;
import io.pulumi.core.Either;
import io.pulumi.core.annotations.OutputCustomType;
import java.lang.Object;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class SSISPackageLocationResponse {
    /**
     * The package access credential.
     * 
     */
    private final @Nullable SSISAccessCredentialResponse accessCredential;
    /**
     * The embedded child package list.
     * 
     */
    private final @Nullable List<SSISChildPackageResponse> childPackages;
    /**
     * The configuration file access credential.
     * 
     */
    private final @Nullable SSISAccessCredentialResponse configurationAccessCredential;
    /**
     * The configuration file of the package execution. Type: string (or Expression with resultType string).
     * 
     */
    private final @Nullable Object configurationPath;
    /**
     * The embedded package content. Type: string (or Expression with resultType string).
     * 
     */
    private final @Nullable Object packageContent;
    /**
     * The embedded package last modified date.
     * 
     */
    private final @Nullable String packageLastModifiedDate;
    /**
     * The package name.
     * 
     */
    private final @Nullable String packageName;
    /**
     * Password of the package.
     * 
     */
    private final @Nullable Either<AzureKeyVaultSecretReferenceResponse,SecureStringResponse> packagePassword;
    /**
     * The SSIS package path. Type: string (or Expression with resultType string).
     * 
     */
    private final @Nullable Object packagePath;
    /**
     * The type of SSIS package location.
     * 
     */
    private final @Nullable String type;

    @OutputCustomType.Constructor({"accessCredential","childPackages","configurationAccessCredential","configurationPath","packageContent","packageLastModifiedDate","packageName","packagePassword","packagePath","type"})
    private SSISPackageLocationResponse(
        @Nullable SSISAccessCredentialResponse accessCredential,
        @Nullable List<SSISChildPackageResponse> childPackages,
        @Nullable SSISAccessCredentialResponse configurationAccessCredential,
        @Nullable Object configurationPath,
        @Nullable Object packageContent,
        @Nullable String packageLastModifiedDate,
        @Nullable String packageName,
        @Nullable Either<AzureKeyVaultSecretReferenceResponse,SecureStringResponse> packagePassword,
        @Nullable Object packagePath,
        @Nullable String type) {
        this.accessCredential = accessCredential;
        this.childPackages = childPackages;
        this.configurationAccessCredential = configurationAccessCredential;
        this.configurationPath = configurationPath;
        this.packageContent = packageContent;
        this.packageLastModifiedDate = packageLastModifiedDate;
        this.packageName = packageName;
        this.packagePassword = packagePassword;
        this.packagePath = packagePath;
        this.type = type;
    }

    /**
     * The package access credential.
     * 
     */
    public Optional<SSISAccessCredentialResponse> getAccessCredential() {
        return Optional.ofNullable(this.accessCredential);
    }
    /**
     * The embedded child package list.
     * 
     */
    public List<SSISChildPackageResponse> getChildPackages() {
        return this.childPackages == null ? List.of() : this.childPackages;
    }
    /**
     * The configuration file access credential.
     * 
     */
    public Optional<SSISAccessCredentialResponse> getConfigurationAccessCredential() {
        return Optional.ofNullable(this.configurationAccessCredential);
    }
    /**
     * The configuration file of the package execution. Type: string (or Expression with resultType string).
     * 
     */
    public Optional<Object> getConfigurationPath() {
        return Optional.ofNullable(this.configurationPath);
    }
    /**
     * The embedded package content. Type: string (or Expression with resultType string).
     * 
     */
    public Optional<Object> getPackageContent() {
        return Optional.ofNullable(this.packageContent);
    }
    /**
     * The embedded package last modified date.
     * 
     */
    public Optional<String> getPackageLastModifiedDate() {
        return Optional.ofNullable(this.packageLastModifiedDate);
    }
    /**
     * The package name.
     * 
     */
    public Optional<String> getPackageName() {
        return Optional.ofNullable(this.packageName);
    }
    /**
     * Password of the package.
     * 
     */
    public Optional<Either<AzureKeyVaultSecretReferenceResponse,SecureStringResponse>> getPackagePassword() {
        return Optional.ofNullable(this.packagePassword);
    }
    /**
     * The SSIS package path. Type: string (or Expression with resultType string).
     * 
     */
    public Optional<Object> getPackagePath() {
        return Optional.ofNullable(this.packagePath);
    }
    /**
     * The type of SSIS package location.
     * 
     */
    public Optional<String> getType() {
        return Optional.ofNullable(this.type);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SSISPackageLocationResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable SSISAccessCredentialResponse accessCredential;
        private @Nullable List<SSISChildPackageResponse> childPackages;
        private @Nullable SSISAccessCredentialResponse configurationAccessCredential;
        private @Nullable Object configurationPath;
        private @Nullable Object packageContent;
        private @Nullable String packageLastModifiedDate;
        private @Nullable String packageName;
        private @Nullable Either<AzureKeyVaultSecretReferenceResponse,SecureStringResponse> packagePassword;
        private @Nullable Object packagePath;
        private @Nullable String type;

        public Builder() {
    	      // Empty
        }

        public Builder(SSISPackageLocationResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.accessCredential = defaults.accessCredential;
    	      this.childPackages = defaults.childPackages;
    	      this.configurationAccessCredential = defaults.configurationAccessCredential;
    	      this.configurationPath = defaults.configurationPath;
    	      this.packageContent = defaults.packageContent;
    	      this.packageLastModifiedDate = defaults.packageLastModifiedDate;
    	      this.packageName = defaults.packageName;
    	      this.packagePassword = defaults.packagePassword;
    	      this.packagePath = defaults.packagePath;
    	      this.type = defaults.type;
        }

        public Builder setAccessCredential(@Nullable SSISAccessCredentialResponse accessCredential) {
            this.accessCredential = accessCredential;
            return this;
        }

        public Builder setChildPackages(@Nullable List<SSISChildPackageResponse> childPackages) {
            this.childPackages = childPackages;
            return this;
        }

        public Builder setConfigurationAccessCredential(@Nullable SSISAccessCredentialResponse configurationAccessCredential) {
            this.configurationAccessCredential = configurationAccessCredential;
            return this;
        }

        public Builder setConfigurationPath(@Nullable Object configurationPath) {
            this.configurationPath = configurationPath;
            return this;
        }

        public Builder setPackageContent(@Nullable Object packageContent) {
            this.packageContent = packageContent;
            return this;
        }

        public Builder setPackageLastModifiedDate(@Nullable String packageLastModifiedDate) {
            this.packageLastModifiedDate = packageLastModifiedDate;
            return this;
        }

        public Builder setPackageName(@Nullable String packageName) {
            this.packageName = packageName;
            return this;
        }

        public Builder setPackagePassword(@Nullable Either<AzureKeyVaultSecretReferenceResponse,SecureStringResponse> packagePassword) {
            this.packagePassword = packagePassword;
            return this;
        }

        public Builder setPackagePath(@Nullable Object packagePath) {
            this.packagePath = packagePath;
            return this;
        }

        public Builder setType(@Nullable String type) {
            this.type = type;
            return this;
        }

        public SSISPackageLocationResponse build() {
            return new SSISPackageLocationResponse(accessCredential, childPackages, configurationAccessCredential, configurationPath, packageContent, packageLastModifiedDate, packageName, packagePassword, packagePath, type);
        }
    }
}
