// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.recoveryservices.outputs;

import io.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.lang.Integer;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class DiskExclusionPropertiesResponse {
    /**
     * List of Disks' Logical Unit Numbers (LUN) to be used for VM Protection.
     * 
     */
    private final @Nullable List<Integer> diskLunList;
    /**
     * Flag to indicate whether DiskLunList is to be included/ excluded from backup.
     * 
     */
    private final @Nullable Boolean isInclusionList;

    @CustomType.Constructor
    private DiskExclusionPropertiesResponse(
        @CustomType.Parameter("diskLunList") @Nullable List<Integer> diskLunList,
        @CustomType.Parameter("isInclusionList") @Nullable Boolean isInclusionList) {
        this.diskLunList = diskLunList;
        this.isInclusionList = isInclusionList;
    }

    /**
     * List of Disks' Logical Unit Numbers (LUN) to be used for VM Protection.
     * 
    */
    public List<Integer> getDiskLunList() {
        return this.diskLunList == null ? List.of() : this.diskLunList;
    }
    /**
     * Flag to indicate whether DiskLunList is to be included/ excluded from backup.
     * 
    */
    public Optional<Boolean> getIsInclusionList() {
        return Optional.ofNullable(this.isInclusionList);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DiskExclusionPropertiesResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable List<Integer> diskLunList;
        private @Nullable Boolean isInclusionList;

        public Builder() {
    	      // Empty
        }

        public Builder(DiskExclusionPropertiesResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.diskLunList = defaults.diskLunList;
    	      this.isInclusionList = defaults.isInclusionList;
        }

        public Builder diskLunList(@Nullable List<Integer> diskLunList) {
            this.diskLunList = diskLunList;
            return this;
        }

        public Builder isInclusionList(@Nullable Boolean isInclusionList) {
            this.isInclusionList = isInclusionList;
            return this;
        }
        public DiskExclusionPropertiesResponse build() {
            return new DiskExclusionPropertiesResponse(diskLunList, isInclusionList);
        }
    }
}
