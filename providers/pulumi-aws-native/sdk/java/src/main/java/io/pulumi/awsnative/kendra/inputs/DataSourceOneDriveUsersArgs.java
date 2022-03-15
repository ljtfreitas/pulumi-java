// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.kendra.inputs;

import io.pulumi.awsnative.kendra.inputs.DataSourceS3PathArgs;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class DataSourceOneDriveUsersArgs extends io.pulumi.resources.ResourceArgs {

    public static final DataSourceOneDriveUsersArgs Empty = new DataSourceOneDriveUsersArgs();

    @Import(name="oneDriveUserList")
      private final @Nullable Output<List<String>> oneDriveUserList;

    public Output<List<String>> getOneDriveUserList() {
        return this.oneDriveUserList == null ? Output.empty() : this.oneDriveUserList;
    }

    @Import(name="oneDriveUserS3Path")
      private final @Nullable Output<DataSourceS3PathArgs> oneDriveUserS3Path;

    public Output<DataSourceS3PathArgs> getOneDriveUserS3Path() {
        return this.oneDriveUserS3Path == null ? Output.empty() : this.oneDriveUserS3Path;
    }

    public DataSourceOneDriveUsersArgs(
        @Nullable Output<List<String>> oneDriveUserList,
        @Nullable Output<DataSourceS3PathArgs> oneDriveUserS3Path) {
        this.oneDriveUserList = oneDriveUserList;
        this.oneDriveUserS3Path = oneDriveUserS3Path;
    }

    private DataSourceOneDriveUsersArgs() {
        this.oneDriveUserList = Output.empty();
        this.oneDriveUserS3Path = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DataSourceOneDriveUsersArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<List<String>> oneDriveUserList;
        private @Nullable Output<DataSourceS3PathArgs> oneDriveUserS3Path;

        public Builder() {
    	      // Empty
        }

        public Builder(DataSourceOneDriveUsersArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.oneDriveUserList = defaults.oneDriveUserList;
    	      this.oneDriveUserS3Path = defaults.oneDriveUserS3Path;
        }

        public Builder oneDriveUserList(@Nullable Output<List<String>> oneDriveUserList) {
            this.oneDriveUserList = oneDriveUserList;
            return this;
        }

        public Builder oneDriveUserList(@Nullable List<String> oneDriveUserList) {
            this.oneDriveUserList = Output.ofNullable(oneDriveUserList);
            return this;
        }

        public Builder oneDriveUserS3Path(@Nullable Output<DataSourceS3PathArgs> oneDriveUserS3Path) {
            this.oneDriveUserS3Path = oneDriveUserS3Path;
            return this;
        }

        public Builder oneDriveUserS3Path(@Nullable DataSourceS3PathArgs oneDriveUserS3Path) {
            this.oneDriveUserS3Path = Output.ofNullable(oneDriveUserS3Path);
            return this;
        }
        public DataSourceOneDriveUsersArgs build() {
            return new DataSourceOneDriveUsersArgs(oneDriveUserList, oneDriveUserS3Path);
        }
    }
}
