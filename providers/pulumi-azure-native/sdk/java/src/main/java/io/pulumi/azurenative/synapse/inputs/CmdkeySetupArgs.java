// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.synapse.inputs;

import io.pulumi.azurenative.synapse.inputs.SecureStringArgs;
import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.Object;
import java.lang.String;
import java.util.Objects;


/**
 * The custom setup of running cmdkey commands.
 * 
 */
public final class CmdkeySetupArgs extends io.pulumi.resources.ResourceArgs {

    public static final CmdkeySetupArgs Empty = new CmdkeySetupArgs();

    /**
     * The password of data source access.
     * 
     */
    @InputImport(name="password", required=true)
        private final Input<SecureStringArgs> password;

    public Input<SecureStringArgs> getPassword() {
        return this.password;
    }

    /**
     * The server name of data source access.
     * 
     */
    @InputImport(name="targetName", required=true)
        private final Input<Object> targetName;

    public Input<Object> getTargetName() {
        return this.targetName;
    }

    /**
     * The type of custom setup.
     * Expected value is 'CmdkeySetup'.
     * 
     */
    @InputImport(name="type", required=true)
        private final Input<String> type;

    public Input<String> getType() {
        return this.type;
    }

    /**
     * The user name of data source access.
     * 
     */
    @InputImport(name="userName", required=true)
        private final Input<Object> userName;

    public Input<Object> getUserName() {
        return this.userName;
    }

    public CmdkeySetupArgs(
        Input<SecureStringArgs> password,
        Input<Object> targetName,
        Input<String> type,
        Input<Object> userName) {
        this.password = Objects.requireNonNull(password, "expected parameter 'password' to be non-null");
        this.targetName = Objects.requireNonNull(targetName, "expected parameter 'targetName' to be non-null");
        this.type = Objects.requireNonNull(type, "expected parameter 'type' to be non-null");
        this.userName = Objects.requireNonNull(userName, "expected parameter 'userName' to be non-null");
    }

    private CmdkeySetupArgs() {
        this.password = Input.empty();
        this.targetName = Input.empty();
        this.type = Input.empty();
        this.userName = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(CmdkeySetupArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<SecureStringArgs> password;
        private Input<Object> targetName;
        private Input<String> type;
        private Input<Object> userName;

        public Builder() {
    	      // Empty
        }

        public Builder(CmdkeySetupArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.password = defaults.password;
    	      this.targetName = defaults.targetName;
    	      this.type = defaults.type;
    	      this.userName = defaults.userName;
        }

        public Builder setPassword(Input<SecureStringArgs> password) {
            this.password = Objects.requireNonNull(password);
            return this;
        }

        public Builder setPassword(SecureStringArgs password) {
            this.password = Input.of(Objects.requireNonNull(password));
            return this;
        }

        public Builder setTargetName(Input<Object> targetName) {
            this.targetName = Objects.requireNonNull(targetName);
            return this;
        }

        public Builder setTargetName(Object targetName) {
            this.targetName = Input.of(Objects.requireNonNull(targetName));
            return this;
        }

        public Builder setType(Input<String> type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }

        public Builder setType(String type) {
            this.type = Input.of(Objects.requireNonNull(type));
            return this;
        }

        public Builder setUserName(Input<Object> userName) {
            this.userName = Objects.requireNonNull(userName);
            return this;
        }

        public Builder setUserName(Object userName) {
            this.userName = Input.of(Objects.requireNonNull(userName));
            return this;
        }
        public CmdkeySetupArgs build() {
            return new CmdkeySetupArgs(password, targetName, type, userName);
        }
    }
}
