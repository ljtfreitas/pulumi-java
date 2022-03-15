// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.iot;

import io.pulumi.awsnative.iot.inputs.MitigationActionActionParamsArgs;
import io.pulumi.awsnative.iot.inputs.MitigationActionTagArgs;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class MitigationActionArgs extends io.pulumi.resources.ResourceArgs {

    public static final MitigationActionArgs Empty = new MitigationActionArgs();

    /**
     * A unique identifier for the mitigation action.
     * 
     */
    @Import(name="actionName")
      private final @Nullable Output<String> actionName;

    public Output<String> getActionName() {
        return this.actionName == null ? Output.empty() : this.actionName;
    }

    @Import(name="actionParams", required=true)
      private final Output<MitigationActionActionParamsArgs> actionParams;

    public Output<MitigationActionActionParamsArgs> getActionParams() {
        return this.actionParams;
    }

    @Import(name="roleArn", required=true)
      private final Output<String> roleArn;

    public Output<String> getRoleArn() {
        return this.roleArn;
    }

    /**
     * An array of key-value pairs to apply to this resource.
     * 
     */
    @Import(name="tags")
      private final @Nullable Output<List<MitigationActionTagArgs>> tags;

    public Output<List<MitigationActionTagArgs>> getTags() {
        return this.tags == null ? Output.empty() : this.tags;
    }

    public MitigationActionArgs(
        @Nullable Output<String> actionName,
        Output<MitigationActionActionParamsArgs> actionParams,
        Output<String> roleArn,
        @Nullable Output<List<MitigationActionTagArgs>> tags) {
        this.actionName = actionName;
        this.actionParams = Objects.requireNonNull(actionParams, "expected parameter 'actionParams' to be non-null");
        this.roleArn = Objects.requireNonNull(roleArn, "expected parameter 'roleArn' to be non-null");
        this.tags = tags;
    }

    private MitigationActionArgs() {
        this.actionName = Output.empty();
        this.actionParams = Output.empty();
        this.roleArn = Output.empty();
        this.tags = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(MitigationActionArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> actionName;
        private Output<MitigationActionActionParamsArgs> actionParams;
        private Output<String> roleArn;
        private @Nullable Output<List<MitigationActionTagArgs>> tags;

        public Builder() {
    	      // Empty
        }

        public Builder(MitigationActionArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.actionName = defaults.actionName;
    	      this.actionParams = defaults.actionParams;
    	      this.roleArn = defaults.roleArn;
    	      this.tags = defaults.tags;
        }

        public Builder actionName(@Nullable Output<String> actionName) {
            this.actionName = actionName;
            return this;
        }

        public Builder actionName(@Nullable String actionName) {
            this.actionName = Output.ofNullable(actionName);
            return this;
        }

        public Builder actionParams(Output<MitigationActionActionParamsArgs> actionParams) {
            this.actionParams = Objects.requireNonNull(actionParams);
            return this;
        }

        public Builder actionParams(MitigationActionActionParamsArgs actionParams) {
            this.actionParams = Output.of(Objects.requireNonNull(actionParams));
            return this;
        }

        public Builder roleArn(Output<String> roleArn) {
            this.roleArn = Objects.requireNonNull(roleArn);
            return this;
        }

        public Builder roleArn(String roleArn) {
            this.roleArn = Output.of(Objects.requireNonNull(roleArn));
            return this;
        }

        public Builder tags(@Nullable Output<List<MitigationActionTagArgs>> tags) {
            this.tags = tags;
            return this;
        }

        public Builder tags(@Nullable List<MitigationActionTagArgs> tags) {
            this.tags = Output.ofNullable(tags);
            return this;
        }
        public MitigationActionArgs build() {
            return new MitigationActionArgs(actionName, actionParams, roleArn, tags);
        }
    }
}
