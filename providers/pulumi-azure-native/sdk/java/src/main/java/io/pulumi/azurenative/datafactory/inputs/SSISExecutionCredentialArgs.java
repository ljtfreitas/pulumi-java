// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.datafactory.inputs;

import io.pulumi.azurenative.datafactory.inputs.SecureStringArgs;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.Object;
import java.util.Objects;


/**
 * SSIS package execution credential.
 * 
 */
public final class SSISExecutionCredentialArgs extends io.pulumi.resources.ResourceArgs {

    public static final SSISExecutionCredentialArgs Empty = new SSISExecutionCredentialArgs();

    /**
     * Domain for windows authentication.
     * 
     */
    @Import(name="domain", required=true)
      private final Output<Object> domain;

    public Output<Object> getDomain() {
        return this.domain;
    }

    /**
     * Password for windows authentication.
     * 
     */
    @Import(name="password", required=true)
      private final Output<SecureStringArgs> password;

    public Output<SecureStringArgs> getPassword() {
        return this.password;
    }

    /**
     * UseName for windows authentication.
     * 
     */
    @Import(name="userName", required=true)
      private final Output<Object> userName;

    public Output<Object> getUserName() {
        return this.userName;
    }

    public SSISExecutionCredentialArgs(
        Output<Object> domain,
        Output<SecureStringArgs> password,
        Output<Object> userName) {
        this.domain = Objects.requireNonNull(domain, "expected parameter 'domain' to be non-null");
        this.password = Objects.requireNonNull(password, "expected parameter 'password' to be non-null");
        this.userName = Objects.requireNonNull(userName, "expected parameter 'userName' to be non-null");
    }

    private SSISExecutionCredentialArgs() {
        this.domain = Output.empty();
        this.password = Output.empty();
        this.userName = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SSISExecutionCredentialArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<Object> domain;
        private Output<SecureStringArgs> password;
        private Output<Object> userName;

        public Builder() {
    	      // Empty
        }

        public Builder(SSISExecutionCredentialArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.domain = defaults.domain;
    	      this.password = defaults.password;
    	      this.userName = defaults.userName;
        }

        public Builder domain(Output<Object> domain) {
            this.domain = Objects.requireNonNull(domain);
            return this;
        }

        public Builder domain(Object domain) {
            this.domain = Output.of(Objects.requireNonNull(domain));
            return this;
        }

        public Builder password(Output<SecureStringArgs> password) {
            this.password = Objects.requireNonNull(password);
            return this;
        }

        public Builder password(SecureStringArgs password) {
            this.password = Output.of(Objects.requireNonNull(password));
            return this;
        }

        public Builder userName(Output<Object> userName) {
            this.userName = Objects.requireNonNull(userName);
            return this;
        }

        public Builder userName(Object userName) {
            this.userName = Output.of(Objects.requireNonNull(userName));
            return this;
        }
        public SSISExecutionCredentialArgs build() {
            return new SSISExecutionCredentialArgs(domain, password, userName);
        }
    }
}
