// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.panorama.outputs;

import io.pulumi.awsnative.panorama.enums.PackageVersionStatus;
import io.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class GetPackageVersionResult {
    private final @Nullable Boolean isLatestPatch;
    private final @Nullable Boolean markLatest;
    private final @Nullable String packageArn;
    private final @Nullable String packageName;
    private final @Nullable Integer registeredTime;
    private final @Nullable PackageVersionStatus status;
    private final @Nullable String statusDescription;
    private final @Nullable String updatedLatestPatchVersion;

    @CustomType.Constructor
    private GetPackageVersionResult(
        @CustomType.Parameter("isLatestPatch") @Nullable Boolean isLatestPatch,
        @CustomType.Parameter("markLatest") @Nullable Boolean markLatest,
        @CustomType.Parameter("packageArn") @Nullable String packageArn,
        @CustomType.Parameter("packageName") @Nullable String packageName,
        @CustomType.Parameter("registeredTime") @Nullable Integer registeredTime,
        @CustomType.Parameter("status") @Nullable PackageVersionStatus status,
        @CustomType.Parameter("statusDescription") @Nullable String statusDescription,
        @CustomType.Parameter("updatedLatestPatchVersion") @Nullable String updatedLatestPatchVersion) {
        this.isLatestPatch = isLatestPatch;
        this.markLatest = markLatest;
        this.packageArn = packageArn;
        this.packageName = packageName;
        this.registeredTime = registeredTime;
        this.status = status;
        this.statusDescription = statusDescription;
        this.updatedLatestPatchVersion = updatedLatestPatchVersion;
    }

    public Optional<Boolean> getIsLatestPatch() {
        return Optional.ofNullable(this.isLatestPatch);
    }
    public Optional<Boolean> getMarkLatest() {
        return Optional.ofNullable(this.markLatest);
    }
    public Optional<String> getPackageArn() {
        return Optional.ofNullable(this.packageArn);
    }
    public Optional<String> getPackageName() {
        return Optional.ofNullable(this.packageName);
    }
    public Optional<Integer> getRegisteredTime() {
        return Optional.ofNullable(this.registeredTime);
    }
    public Optional<PackageVersionStatus> getStatus() {
        return Optional.ofNullable(this.status);
    }
    public Optional<String> getStatusDescription() {
        return Optional.ofNullable(this.statusDescription);
    }
    public Optional<String> getUpdatedLatestPatchVersion() {
        return Optional.ofNullable(this.updatedLatestPatchVersion);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetPackageVersionResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Boolean isLatestPatch;
        private @Nullable Boolean markLatest;
        private @Nullable String packageArn;
        private @Nullable String packageName;
        private @Nullable Integer registeredTime;
        private @Nullable PackageVersionStatus status;
        private @Nullable String statusDescription;
        private @Nullable String updatedLatestPatchVersion;

        public Builder() {
    	      // Empty
        }

        public Builder(GetPackageVersionResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.isLatestPatch = defaults.isLatestPatch;
    	      this.markLatest = defaults.markLatest;
    	      this.packageArn = defaults.packageArn;
    	      this.packageName = defaults.packageName;
    	      this.registeredTime = defaults.registeredTime;
    	      this.status = defaults.status;
    	      this.statusDescription = defaults.statusDescription;
    	      this.updatedLatestPatchVersion = defaults.updatedLatestPatchVersion;
        }

        public Builder isLatestPatch(@Nullable Boolean isLatestPatch) {
            this.isLatestPatch = isLatestPatch;
            return this;
        }

        public Builder markLatest(@Nullable Boolean markLatest) {
            this.markLatest = markLatest;
            return this;
        }

        public Builder packageArn(@Nullable String packageArn) {
            this.packageArn = packageArn;
            return this;
        }

        public Builder packageName(@Nullable String packageName) {
            this.packageName = packageName;
            return this;
        }

        public Builder registeredTime(@Nullable Integer registeredTime) {
            this.registeredTime = registeredTime;
            return this;
        }

        public Builder status(@Nullable PackageVersionStatus status) {
            this.status = status;
            return this;
        }

        public Builder statusDescription(@Nullable String statusDescription) {
            this.statusDescription = statusDescription;
            return this;
        }

        public Builder updatedLatestPatchVersion(@Nullable String updatedLatestPatchVersion) {
            this.updatedLatestPatchVersion = updatedLatestPatchVersion;
            return this;
        }
        public GetPackageVersionResult build() {
            return new GetPackageVersionResult(isLatestPatch, markLatest, packageArn, packageName, registeredTime, status, statusDescription, updatedLatestPatchVersion);
        }
    }
}
