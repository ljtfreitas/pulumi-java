// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.rds.inputs;

import io.pulumi.aws.rds.inputs.OptionGroupOptionOptionSettingGetArgs;
import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class OptionGroupOptionGetArgs extends io.pulumi.resources.ResourceArgs {

    public static final OptionGroupOptionGetArgs Empty = new OptionGroupOptionGetArgs();

    /**
     * A list of DB Security Groups for which the option is enabled.
     * 
     */
    @InputImport(name="dbSecurityGroupMemberships")
    private final @Nullable Input<List<String>> dbSecurityGroupMemberships;

    public Input<List<String>> getDbSecurityGroupMemberships() {
        return this.dbSecurityGroupMemberships == null ? Input.empty() : this.dbSecurityGroupMemberships;
    }

    /**
     * The Name of the Option (e.g., MEMCACHED).
     * 
     */
    @InputImport(name="optionName", required=true)
    private final Input<String> optionName;

    public Input<String> getOptionName() {
        return this.optionName;
    }

    /**
     * A list of option settings to apply.
     * 
     */
    @InputImport(name="optionSettings")
    private final @Nullable Input<List<OptionGroupOptionOptionSettingGetArgs>> optionSettings;

    public Input<List<OptionGroupOptionOptionSettingGetArgs>> getOptionSettings() {
        return this.optionSettings == null ? Input.empty() : this.optionSettings;
    }

    /**
     * The Port number when connecting to the Option (e.g., 11211).
     * 
     */
    @InputImport(name="port")
    private final @Nullable Input<Integer> port;

    public Input<Integer> getPort() {
        return this.port == null ? Input.empty() : this.port;
    }

    /**
     * The version of the option (e.g., 13.1.0.0).
     * 
     */
    @InputImport(name="version")
    private final @Nullable Input<String> version;

    public Input<String> getVersion() {
        return this.version == null ? Input.empty() : this.version;
    }

    /**
     * A list of VPC Security Groups for which the option is enabled.
     * 
     */
    @InputImport(name="vpcSecurityGroupMemberships")
    private final @Nullable Input<List<String>> vpcSecurityGroupMemberships;

    public Input<List<String>> getVpcSecurityGroupMemberships() {
        return this.vpcSecurityGroupMemberships == null ? Input.empty() : this.vpcSecurityGroupMemberships;
    }

    public OptionGroupOptionGetArgs(
        @Nullable Input<List<String>> dbSecurityGroupMemberships,
        Input<String> optionName,
        @Nullable Input<List<OptionGroupOptionOptionSettingGetArgs>> optionSettings,
        @Nullable Input<Integer> port,
        @Nullable Input<String> version,
        @Nullable Input<List<String>> vpcSecurityGroupMemberships) {
        this.dbSecurityGroupMemberships = dbSecurityGroupMemberships;
        this.optionName = Objects.requireNonNull(optionName, "expected parameter 'optionName' to be non-null");
        this.optionSettings = optionSettings;
        this.port = port;
        this.version = version;
        this.vpcSecurityGroupMemberships = vpcSecurityGroupMemberships;
    }

    private OptionGroupOptionGetArgs() {
        this.dbSecurityGroupMemberships = Input.empty();
        this.optionName = Input.empty();
        this.optionSettings = Input.empty();
        this.port = Input.empty();
        this.version = Input.empty();
        this.vpcSecurityGroupMemberships = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(OptionGroupOptionGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<List<String>> dbSecurityGroupMemberships;
        private Input<String> optionName;
        private @Nullable Input<List<OptionGroupOptionOptionSettingGetArgs>> optionSettings;
        private @Nullable Input<Integer> port;
        private @Nullable Input<String> version;
        private @Nullable Input<List<String>> vpcSecurityGroupMemberships;

        public Builder() {
    	      // Empty
        }

        public Builder(OptionGroupOptionGetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.dbSecurityGroupMemberships = defaults.dbSecurityGroupMemberships;
    	      this.optionName = defaults.optionName;
    	      this.optionSettings = defaults.optionSettings;
    	      this.port = defaults.port;
    	      this.version = defaults.version;
    	      this.vpcSecurityGroupMemberships = defaults.vpcSecurityGroupMemberships;
        }

        public Builder setDbSecurityGroupMemberships(@Nullable Input<List<String>> dbSecurityGroupMemberships) {
            this.dbSecurityGroupMemberships = dbSecurityGroupMemberships;
            return this;
        }

        public Builder setDbSecurityGroupMemberships(@Nullable List<String> dbSecurityGroupMemberships) {
            this.dbSecurityGroupMemberships = Input.ofNullable(dbSecurityGroupMemberships);
            return this;
        }

        public Builder setOptionName(Input<String> optionName) {
            this.optionName = Objects.requireNonNull(optionName);
            return this;
        }

        public Builder setOptionName(String optionName) {
            this.optionName = Input.of(Objects.requireNonNull(optionName));
            return this;
        }

        public Builder setOptionSettings(@Nullable Input<List<OptionGroupOptionOptionSettingGetArgs>> optionSettings) {
            this.optionSettings = optionSettings;
            return this;
        }

        public Builder setOptionSettings(@Nullable List<OptionGroupOptionOptionSettingGetArgs> optionSettings) {
            this.optionSettings = Input.ofNullable(optionSettings);
            return this;
        }

        public Builder setPort(@Nullable Input<Integer> port) {
            this.port = port;
            return this;
        }

        public Builder setPort(@Nullable Integer port) {
            this.port = Input.ofNullable(port);
            return this;
        }

        public Builder setVersion(@Nullable Input<String> version) {
            this.version = version;
            return this;
        }

        public Builder setVersion(@Nullable String version) {
            this.version = Input.ofNullable(version);
            return this;
        }

        public Builder setVpcSecurityGroupMemberships(@Nullable Input<List<String>> vpcSecurityGroupMemberships) {
            this.vpcSecurityGroupMemberships = vpcSecurityGroupMemberships;
            return this;
        }

        public Builder setVpcSecurityGroupMemberships(@Nullable List<String> vpcSecurityGroupMemberships) {
            this.vpcSecurityGroupMemberships = Input.ofNullable(vpcSecurityGroupMemberships);
            return this;
        }
        public OptionGroupOptionGetArgs build() {
            return new OptionGroupOptionGetArgs(dbSecurityGroupMemberships, optionName, optionSettings, port, version, vpcSecurityGroupMemberships);
        }
    }
}
