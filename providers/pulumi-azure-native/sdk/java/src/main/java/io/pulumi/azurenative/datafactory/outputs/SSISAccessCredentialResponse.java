// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.datafactory.outputs;

import io.pulumi.azurenative.datafactory.outputs.AzureKeyVaultSecretReferenceResponse;
import io.pulumi.azurenative.datafactory.outputs.SecureStringResponse;
import io.pulumi.core.Either;
import io.pulumi.core.annotations.CustomType;
import java.lang.Object;
import java.util.Objects;

@CustomType
public final class SSISAccessCredentialResponse {
    /**
     * Domain for windows authentication.
     * 
     */
    private final Object domain;
    /**
     * Password for windows authentication.
     * 
     */
    private final Either<AzureKeyVaultSecretReferenceResponse,SecureStringResponse> password;
    /**
     * UseName for windows authentication.
     * 
     */
    private final Object userName;

    @CustomType.Constructor
    private SSISAccessCredentialResponse(
        @CustomType.Parameter("domain") Object domain,
        @CustomType.Parameter("password") Either<AzureKeyVaultSecretReferenceResponse,SecureStringResponse> password,
        @CustomType.Parameter("userName") Object userName) {
        this.domain = domain;
        this.password = password;
        this.userName = userName;
    }

    /**
     * Domain for windows authentication.
     * 
    */
    public Object getDomain() {
        return this.domain;
    }
    /**
     * Password for windows authentication.
     * 
    */
    public Either<AzureKeyVaultSecretReferenceResponse,SecureStringResponse> getPassword() {
        return this.password;
    }
    /**
     * UseName for windows authentication.
     * 
    */
    public Object getUserName() {
        return this.userName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SSISAccessCredentialResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Object domain;
        private Either<AzureKeyVaultSecretReferenceResponse,SecureStringResponse> password;
        private Object userName;

        public Builder() {
    	      // Empty
        }

        public Builder(SSISAccessCredentialResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.domain = defaults.domain;
    	      this.password = defaults.password;
    	      this.userName = defaults.userName;
        }

        public Builder domain(Object domain) {
            this.domain = Objects.requireNonNull(domain);
            return this;
        }

        public Builder password(Either<AzureKeyVaultSecretReferenceResponse,SecureStringResponse> password) {
            this.password = Objects.requireNonNull(password);
            return this;
        }

        public Builder userName(Object userName) {
            this.userName = Objects.requireNonNull(userName);
            return this;
        }
        public SSISAccessCredentialResponse build() {
            return new SSISAccessCredentialResponse(domain, password, userName);
        }
    }
}
