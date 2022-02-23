// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.cfg;

import io.pulumi.aws.cfg.inputs.RecorderRecordingGroupArgs;
import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class RecorderArgs extends io.pulumi.resources.ResourceArgs {

    public static final RecorderArgs Empty = new RecorderArgs();

    /**
     * The name of the recorder. Defaults to `default`. Changing it recreates the resource.
     * 
     */
    @InputImport(name="name")
    private final @Nullable Input<String> name;

    public Input<String> getName() {
        return this.name == null ? Input.empty() : this.name;
    }

    /**
     * Recording group - see below.
     * 
     */
    @InputImport(name="recordingGroup")
    private final @Nullable Input<RecorderRecordingGroupArgs> recordingGroup;

    public Input<RecorderRecordingGroupArgs> getRecordingGroup() {
        return this.recordingGroup == null ? Input.empty() : this.recordingGroup;
    }

    /**
     * Amazon Resource Name (ARN) of the IAM role. Used to make read or write requests to the delivery channel and to describe the AWS resources associated with the account. See [AWS Docs](http://docs.aws.amazon.com/config/latest/developerguide/iamrole-permissions.html) for more details.
     * 
     */
    @InputImport(name="roleArn", required=true)
    private final Input<String> roleArn;

    public Input<String> getRoleArn() {
        return this.roleArn;
    }

    public RecorderArgs(
        @Nullable Input<String> name,
        @Nullable Input<RecorderRecordingGroupArgs> recordingGroup,
        Input<String> roleArn) {
        this.name = name;
        this.recordingGroup = recordingGroup;
        this.roleArn = Objects.requireNonNull(roleArn, "expected parameter 'roleArn' to be non-null");
    }

    private RecorderArgs() {
        this.name = Input.empty();
        this.recordingGroup = Input.empty();
        this.roleArn = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(RecorderArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> name;
        private @Nullable Input<RecorderRecordingGroupArgs> recordingGroup;
        private Input<String> roleArn;

        public Builder() {
    	      // Empty
        }

        public Builder(RecorderArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.name = defaults.name;
    	      this.recordingGroup = defaults.recordingGroup;
    	      this.roleArn = defaults.roleArn;
        }

        public Builder setName(@Nullable Input<String> name) {
            this.name = name;
            return this;
        }

        public Builder setName(@Nullable String name) {
            this.name = Input.ofNullable(name);
            return this;
        }

        public Builder setRecordingGroup(@Nullable Input<RecorderRecordingGroupArgs> recordingGroup) {
            this.recordingGroup = recordingGroup;
            return this;
        }

        public Builder setRecordingGroup(@Nullable RecorderRecordingGroupArgs recordingGroup) {
            this.recordingGroup = Input.ofNullable(recordingGroup);
            return this;
        }

        public Builder setRoleArn(Input<String> roleArn) {
            this.roleArn = Objects.requireNonNull(roleArn);
            return this;
        }

        public Builder setRoleArn(String roleArn) {
            this.roleArn = Input.of(Objects.requireNonNull(roleArn));
            return this;
        }
        public RecorderArgs build() {
            return new RecorderArgs(name, recordingGroup, roleArn);
        }
    }
}
