// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.kendra.inputs;

import io.pulumi.awsnative.kendra.inputs.DataSourceS3PathArgs;
import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class DataSourceOneDriveUsersArgs extends io.pulumi.resources.ResourceArgs {

    public static final DataSourceOneDriveUsersArgs Empty = new DataSourceOneDriveUsersArgs();

    @InputImport(name="oneDriveUserList")
        private final @Nullable Input<List<String>> oneDriveUserList;

    public Input<List<String>> getOneDriveUserList() {
        return this.oneDriveUserList == null ? Input.empty() : this.oneDriveUserList;
    }

    @InputImport(name="oneDriveUserS3Path")
        private final @Nullable Input<DataSourceS3PathArgs> oneDriveUserS3Path;

    public Input<DataSourceS3PathArgs> getOneDriveUserS3Path() {
        return this.oneDriveUserS3Path == null ? Input.empty() : this.oneDriveUserS3Path;
    }

    public DataSourceOneDriveUsersArgs(
        @Nullable Input<List<String>> oneDriveUserList,
        @Nullable Input<DataSourceS3PathArgs> oneDriveUserS3Path) {
        this.oneDriveUserList = oneDriveUserList;
        this.oneDriveUserS3Path = oneDriveUserS3Path;
    }

    private DataSourceOneDriveUsersArgs() {
        this.oneDriveUserList = Input.empty();
        this.oneDriveUserS3Path = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DataSourceOneDriveUsersArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<List<String>> oneDriveUserList;
        private @Nullable Input<DataSourceS3PathArgs> oneDriveUserS3Path;

        public Builder() {
    	      // Empty
        }

        public Builder(DataSourceOneDriveUsersArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.oneDriveUserList = defaults.oneDriveUserList;
    	      this.oneDriveUserS3Path = defaults.oneDriveUserS3Path;
        }

        public Builder setOneDriveUserList(@Nullable Input<List<String>> oneDriveUserList) {
            this.oneDriveUserList = oneDriveUserList;
            return this;
        }

        public Builder setOneDriveUserList(@Nullable List<String> oneDriveUserList) {
            this.oneDriveUserList = Input.ofNullable(oneDriveUserList);
            return this;
        }

        public Builder setOneDriveUserS3Path(@Nullable Input<DataSourceS3PathArgs> oneDriveUserS3Path) {
            this.oneDriveUserS3Path = oneDriveUserS3Path;
            return this;
        }

        public Builder setOneDriveUserS3Path(@Nullable DataSourceS3PathArgs oneDriveUserS3Path) {
            this.oneDriveUserS3Path = Input.ofNullable(oneDriveUserS3Path);
            return this;
        }
        public DataSourceOneDriveUsersArgs build() {
            return new DataSourceOneDriveUsersArgs(oneDriveUserList, oneDriveUserS3Path);
        }
    }
}
