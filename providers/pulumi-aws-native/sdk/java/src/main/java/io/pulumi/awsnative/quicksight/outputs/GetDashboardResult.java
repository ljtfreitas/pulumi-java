// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.quicksight.outputs;

import io.pulumi.awsnative.quicksight.outputs.DashboardResourcePermission;
import io.pulumi.awsnative.quicksight.outputs.DashboardTag;
import io.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class GetDashboardResult {
    /**
     * <p>The Amazon Resource Name (ARN) of the resource.</p>
     * 
     */
    private final @Nullable String arn;
    /**
     * <p>The last time that this dataset was published.</p>
     * 
     */
    private final @Nullable String lastPublishedTime;
    /**
     * <p>The display name of the dashboard.</p>
     * 
     */
    private final @Nullable String name;
    /**
     * <p>A structure that contains the permissions of the dashboard. You can use this structure
     *             for granting permissions by providing a list of IAM action information for each
     *             principal ARN. </p>
     * 
     *         <p>To specify no permissions, omit the permissions list.</p>
     * 
     */
    private final @Nullable List<DashboardResourcePermission> permissions;
    /**
     * <p>Contains a map of the key-value pairs for the resource tag or tags assigned to the
     *             dashboard.</p>
     * 
     */
    private final @Nullable List<DashboardTag> tags;

    @CustomType.Constructor
    private GetDashboardResult(
        @CustomType.Parameter("arn") @Nullable String arn,
        @CustomType.Parameter("lastPublishedTime") @Nullable String lastPublishedTime,
        @CustomType.Parameter("name") @Nullable String name,
        @CustomType.Parameter("permissions") @Nullable List<DashboardResourcePermission> permissions,
        @CustomType.Parameter("tags") @Nullable List<DashboardTag> tags) {
        this.arn = arn;
        this.lastPublishedTime = lastPublishedTime;
        this.name = name;
        this.permissions = permissions;
        this.tags = tags;
    }

    /**
     * <p>The Amazon Resource Name (ARN) of the resource.</p>
     * 
    */
    public Optional<String> getArn() {
        return Optional.ofNullable(this.arn);
    }
    /**
     * <p>The last time that this dataset was published.</p>
     * 
    */
    public Optional<String> getLastPublishedTime() {
        return Optional.ofNullable(this.lastPublishedTime);
    }
    /**
     * <p>The display name of the dashboard.</p>
     * 
    */
    public Optional<String> getName() {
        return Optional.ofNullable(this.name);
    }
    /**
     * <p>A structure that contains the permissions of the dashboard. You can use this structure
     *             for granting permissions by providing a list of IAM action information for each
     *             principal ARN. </p>
     * 
     *         <p>To specify no permissions, omit the permissions list.</p>
     * 
    */
    public List<DashboardResourcePermission> getPermissions() {
        return this.permissions == null ? List.of() : this.permissions;
    }
    /**
     * <p>Contains a map of the key-value pairs for the resource tag or tags assigned to the
     *             dashboard.</p>
     * 
    */
    public List<DashboardTag> getTags() {
        return this.tags == null ? List.of() : this.tags;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetDashboardResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String arn;
        private @Nullable String lastPublishedTime;
        private @Nullable String name;
        private @Nullable List<DashboardResourcePermission> permissions;
        private @Nullable List<DashboardTag> tags;

        public Builder() {
    	      // Empty
        }

        public Builder(GetDashboardResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.arn = defaults.arn;
    	      this.lastPublishedTime = defaults.lastPublishedTime;
    	      this.name = defaults.name;
    	      this.permissions = defaults.permissions;
    	      this.tags = defaults.tags;
        }

        public Builder arn(@Nullable String arn) {
            this.arn = arn;
            return this;
        }

        public Builder lastPublishedTime(@Nullable String lastPublishedTime) {
            this.lastPublishedTime = lastPublishedTime;
            return this;
        }

        public Builder name(@Nullable String name) {
            this.name = name;
            return this;
        }

        public Builder permissions(@Nullable List<DashboardResourcePermission> permissions) {
            this.permissions = permissions;
            return this;
        }

        public Builder tags(@Nullable List<DashboardTag> tags) {
            this.tags = tags;
            return this;
        }
        public GetDashboardResult build() {
            return new GetDashboardResult(arn, lastPublishedTime, name, permissions, tags);
        }
    }
}
