// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.datasync;

import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


public final class LocationFsxLustreArgs extends io.pulumi.resources.ResourceArgs {

    public static final LocationFsxLustreArgs Empty = new LocationFsxLustreArgs();

    /**
     * The Amazon Resource Name (ARN) for the FSx for Lustre file system.
     * 
     */
    @InputImport(name="fsxFilesystemArn", required=true)
    private final Input<String> fsxFilesystemArn;

    public Input<String> getFsxFilesystemArn() {
        return this.fsxFilesystemArn;
    }

    /**
     * The Amazon Resource Names (ARNs) of the security groups that are to use to configure the FSx for Lustre file system.
     * 
     */
    @InputImport(name="securityGroupArns", required=true)
    private final Input<List<String>> securityGroupArns;

    public Input<List<String>> getSecurityGroupArns() {
        return this.securityGroupArns;
    }

    /**
     * Subdirectory to perform actions as source or destination.
     * 
     */
    @InputImport(name="subdirectory")
    private final @Nullable Input<String> subdirectory;

    public Input<String> getSubdirectory() {
        return this.subdirectory == null ? Input.empty() : this.subdirectory;
    }

    /**
     * Key-value pairs of resource tags to assign to the DataSync Location. If configured with a provider [`default_tags` configuration block](https://www.terraform.io/docs/providers/aws/index.html#default_tags-configuration-block) present, tags with matching keys will overwrite those defined at the provider-level.
     * 
     */
    @InputImport(name="tags")
    private final @Nullable Input<Map<String,String>> tags;

    public Input<Map<String,String>> getTags() {
        return this.tags == null ? Input.empty() : this.tags;
    }

    /**
     * A map of tags assigned to the resource, including those inherited from the provider [`default_tags` configuration block](https://www.terraform.io/docs/providers/aws/index.html#default_tags-configuration-block).
     * 
     */
    @InputImport(name="tagsAll")
    private final @Nullable Input<Map<String,String>> tagsAll;

    public Input<Map<String,String>> getTagsAll() {
        return this.tagsAll == null ? Input.empty() : this.tagsAll;
    }

    public LocationFsxLustreArgs(
        Input<String> fsxFilesystemArn,
        Input<List<String>> securityGroupArns,
        @Nullable Input<String> subdirectory,
        @Nullable Input<Map<String,String>> tags,
        @Nullable Input<Map<String,String>> tagsAll) {
        this.fsxFilesystemArn = Objects.requireNonNull(fsxFilesystemArn, "expected parameter 'fsxFilesystemArn' to be non-null");
        this.securityGroupArns = Objects.requireNonNull(securityGroupArns, "expected parameter 'securityGroupArns' to be non-null");
        this.subdirectory = subdirectory;
        this.tags = tags;
        this.tagsAll = tagsAll;
    }

    private LocationFsxLustreArgs() {
        this.fsxFilesystemArn = Input.empty();
        this.securityGroupArns = Input.empty();
        this.subdirectory = Input.empty();
        this.tags = Input.empty();
        this.tagsAll = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(LocationFsxLustreArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<String> fsxFilesystemArn;
        private Input<List<String>> securityGroupArns;
        private @Nullable Input<String> subdirectory;
        private @Nullable Input<Map<String,String>> tags;
        private @Nullable Input<Map<String,String>> tagsAll;

        public Builder() {
    	      // Empty
        }

        public Builder(LocationFsxLustreArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.fsxFilesystemArn = defaults.fsxFilesystemArn;
    	      this.securityGroupArns = defaults.securityGroupArns;
    	      this.subdirectory = defaults.subdirectory;
    	      this.tags = defaults.tags;
    	      this.tagsAll = defaults.tagsAll;
        }

        public Builder setFsxFilesystemArn(Input<String> fsxFilesystemArn) {
            this.fsxFilesystemArn = Objects.requireNonNull(fsxFilesystemArn);
            return this;
        }

        public Builder setFsxFilesystemArn(String fsxFilesystemArn) {
            this.fsxFilesystemArn = Input.of(Objects.requireNonNull(fsxFilesystemArn));
            return this;
        }

        public Builder setSecurityGroupArns(Input<List<String>> securityGroupArns) {
            this.securityGroupArns = Objects.requireNonNull(securityGroupArns);
            return this;
        }

        public Builder setSecurityGroupArns(List<String> securityGroupArns) {
            this.securityGroupArns = Input.of(Objects.requireNonNull(securityGroupArns));
            return this;
        }

        public Builder setSubdirectory(@Nullable Input<String> subdirectory) {
            this.subdirectory = subdirectory;
            return this;
        }

        public Builder setSubdirectory(@Nullable String subdirectory) {
            this.subdirectory = Input.ofNullable(subdirectory);
            return this;
        }

        public Builder setTags(@Nullable Input<Map<String,String>> tags) {
            this.tags = tags;
            return this;
        }

        public Builder setTags(@Nullable Map<String,String> tags) {
            this.tags = Input.ofNullable(tags);
            return this;
        }

        public Builder setTagsAll(@Nullable Input<Map<String,String>> tagsAll) {
            this.tagsAll = tagsAll;
            return this;
        }

        public Builder setTagsAll(@Nullable Map<String,String> tagsAll) {
            this.tagsAll = Input.ofNullable(tagsAll);
            return this;
        }
        public LocationFsxLustreArgs build() {
            return new LocationFsxLustreArgs(fsxFilesystemArn, securityGroupArns, subdirectory, tags, tagsAll);
        }
    }
}
