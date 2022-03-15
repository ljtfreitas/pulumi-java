// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.datafactory.inputs;

import io.pulumi.azurenative.datafactory.inputs.AzureKeyVaultSecretReferenceResponse;
import io.pulumi.azurenative.datafactory.inputs.SSISAccessCredentialResponse;
import io.pulumi.azurenative.datafactory.inputs.SSISChildPackageResponse;
import io.pulumi.azurenative.datafactory.inputs.SecureStringResponse;
import io.pulumi.core.Either;
import io.pulumi.core.annotations.Import;
import java.lang.Object;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * SSIS package location.
 * 
 */
public final class SSISPackageLocationResponse extends io.pulumi.resources.InvokeArgs {

    public static final SSISPackageLocationResponse Empty = new SSISPackageLocationResponse();

    /**
     * The package access credential.
     * 
     */
    @Import(name="accessCredential")
      private final @Nullable SSISAccessCredentialResponse accessCredential;

    public Optional<SSISAccessCredentialResponse> getAccessCredential() {
        return this.accessCredential == null ? Optional.empty() : Optional.ofNullable(this.accessCredential);
    }

    /**
     * The embedded child package list.
     * 
     */
    @Import(name="childPackages")
      private final @Nullable List<SSISChildPackageResponse> childPackages;

    public List<SSISChildPackageResponse> getChildPackages() {
        return this.childPackages == null ? List.of() : this.childPackages;
    }

    /**
     * The configuration file access credential.
     * 
     */
    @Import(name="configurationAccessCredential")
      private final @Nullable SSISAccessCredentialResponse configurationAccessCredential;

    public Optional<SSISAccessCredentialResponse> getConfigurationAccessCredential() {
        return this.configurationAccessCredential == null ? Optional.empty() : Optional.ofNullable(this.configurationAccessCredential);
    }

    /**
     * The configuration file of the package execution. Type: string (or Expression with resultType string).
     * 
     */
    @Import(name="configurationPath")
      private final @Nullable Object configurationPath;

    public Optional<Object> getConfigurationPath() {
        return this.configurationPath == null ? Optional.empty() : Optional.ofNullable(this.configurationPath);
    }

    /**
     * The embedded package content. Type: string (or Expression with resultType string).
     * 
     */
    @Import(name="packageContent")
      private final @Nullable Object packageContent;

    public Optional<Object> getPackageContent() {
        return this.packageContent == null ? Optional.empty() : Optional.ofNullable(this.packageContent);
    }

    /**
     * The embedded package last modified date.
     * 
     */
    @Import(name="packageLastModifiedDate")
      private final @Nullable String packageLastModifiedDate;

    public Optional<String> getPackageLastModifiedDate() {
        return this.packageLastModifiedDate == null ? Optional.empty() : Optional.ofNullable(this.packageLastModifiedDate);
    }

    /**
     * The package name.
     * 
     */
    @Import(name="packageName")
      private final @Nullable String packageName;

    public Optional<String> getPackageName() {
        return this.packageName == null ? Optional.empty() : Optional.ofNullable(this.packageName);
    }

    /**
     * Password of the package.
     * 
     */
    @Import(name="packagePassword")
      private final @Nullable Either<AzureKeyVaultSecretReferenceResponse,SecureStringResponse> packagePassword;

    public Either<AzureKeyVaultSecretReferenceResponse,SecureStringResponse> getPackagePassword() {
        return this.packagePassword == null ? null : this.packagePassword;
    }

    /**
     * The SSIS package path. Type: string (or Expression with resultType string).
     * 
     */
    @Import(name="packagePath")
      private final @Nullable Object packagePath;

    public Optional<Object> getPackagePath() {
        return this.packagePath == null ? Optional.empty() : Optional.ofNullable(this.packagePath);
    }

    /**
     * The type of SSIS package location.
     * 
     */
    @Import(name="type")
      private final @Nullable String type;

    public Optional<String> getType() {
        return this.type == null ? Optional.empty() : Optional.ofNullable(this.type);
    }

    public SSISPackageLocationResponse(
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

    private SSISPackageLocationResponse() {
        this.accessCredential = null;
        this.childPackages = List.of();
        this.configurationAccessCredential = null;
        this.configurationPath = null;
        this.packageContent = null;
        this.packageLastModifiedDate = null;
        this.packageName = null;
        this.packagePassword = null;
        this.packagePath = null;
        this.type = null;
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

        public Builder accessCredential(@Nullable SSISAccessCredentialResponse accessCredential) {
            this.accessCredential = accessCredential;
            return this;
        }

        public Builder childPackages(@Nullable List<SSISChildPackageResponse> childPackages) {
            this.childPackages = childPackages;
            return this;
        }

        public Builder configurationAccessCredential(@Nullable SSISAccessCredentialResponse configurationAccessCredential) {
            this.configurationAccessCredential = configurationAccessCredential;
            return this;
        }

        public Builder configurationPath(@Nullable Object configurationPath) {
            this.configurationPath = configurationPath;
            return this;
        }

        public Builder packageContent(@Nullable Object packageContent) {
            this.packageContent = packageContent;
            return this;
        }

        public Builder packageLastModifiedDate(@Nullable String packageLastModifiedDate) {
            this.packageLastModifiedDate = packageLastModifiedDate;
            return this;
        }

        public Builder packageName(@Nullable String packageName) {
            this.packageName = packageName;
            return this;
        }

        public Builder packagePassword(@Nullable Either<AzureKeyVaultSecretReferenceResponse,SecureStringResponse> packagePassword) {
            this.packagePassword = packagePassword;
            return this;
        }

        public Builder packagePath(@Nullable Object packagePath) {
            this.packagePath = packagePath;
            return this;
        }

        public Builder type(@Nullable String type) {
            this.type = type;
            return this;
        }
        public SSISPackageLocationResponse build() {
            return new SSISPackageLocationResponse(accessCredential, childPackages, configurationAccessCredential, configurationPath, packageContent, packageLastModifiedDate, packageName, packagePassword, packagePath, type);
        }
    }
}
