// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.ec2.inputs;

import io.pulumi.aws.ec2.enums.InstancePlatform;
import io.pulumi.aws.ec2.enums.InstanceType;
import io.pulumi.aws.ec2.enums.Tenancy;
import io.pulumi.core.Either;
import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


public final class CapacityReservationState extends io.pulumi.resources.ResourceArgs {

    public static final CapacityReservationState Empty = new CapacityReservationState();

    /**
     * The ARN of the Capacity Reservation.
     * 
     */
    @InputImport(name="arn")
    private final @Nullable Input<String> arn;

    public Input<String> getArn() {
        return this.arn == null ? Input.empty() : this.arn;
    }

    /**
     * The Availability Zone in which to create the Capacity Reservation.
     * 
     */
    @InputImport(name="availabilityZone")
    private final @Nullable Input<String> availabilityZone;

    public Input<String> getAvailabilityZone() {
        return this.availabilityZone == null ? Input.empty() : this.availabilityZone;
    }

    /**
     * Indicates whether the Capacity Reservation supports EBS-optimized instances.
     * 
     */
    @InputImport(name="ebsOptimized")
    private final @Nullable Input<Boolean> ebsOptimized;

    public Input<Boolean> getEbsOptimized() {
        return this.ebsOptimized == null ? Input.empty() : this.ebsOptimized;
    }

    /**
     * The date and time at which the Capacity Reservation expires. When a Capacity Reservation expires, the reserved capacity is released and you can no longer launch instances into it. Valid values: [RFC3339 time string](https://tools.ietf.org/html/rfc3339#section-5.8) (`YYYY-MM-DDTHH:MM:SSZ`)
     * 
     */
    @InputImport(name="endDate")
    private final @Nullable Input<String> endDate;

    public Input<String> getEndDate() {
        return this.endDate == null ? Input.empty() : this.endDate;
    }

    /**
     * Indicates the way in which the Capacity Reservation ends. Specify either `unlimited` or `limited`.
     * 
     */
    @InputImport(name="endDateType")
    private final @Nullable Input<String> endDateType;

    public Input<String> getEndDateType() {
        return this.endDateType == null ? Input.empty() : this.endDateType;
    }

    /**
     * Indicates whether the Capacity Reservation supports instances with temporary, block-level storage.
     * 
     */
    @InputImport(name="ephemeralStorage")
    private final @Nullable Input<Boolean> ephemeralStorage;

    public Input<Boolean> getEphemeralStorage() {
        return this.ephemeralStorage == null ? Input.empty() : this.ephemeralStorage;
    }

    /**
     * The number of instances for which to reserve capacity.
     * 
     */
    @InputImport(name="instanceCount")
    private final @Nullable Input<Integer> instanceCount;

    public Input<Integer> getInstanceCount() {
        return this.instanceCount == null ? Input.empty() : this.instanceCount;
    }

    /**
     * Indicates the type of instance launches that the Capacity Reservation accepts. Specify either `open` or `targeted`.
     * 
     */
    @InputImport(name="instanceMatchCriteria")
    private final @Nullable Input<String> instanceMatchCriteria;

    public Input<String> getInstanceMatchCriteria() {
        return this.instanceMatchCriteria == null ? Input.empty() : this.instanceMatchCriteria;
    }

    /**
     * The type of operating system for which to reserve capacity. Valid options are `Linux/UNIX`, `Red Hat Enterprise Linux`, `SUSE Linux`, `Windows`, `Windows with SQL Server`, `Windows with SQL Server Enterprise`, `Windows with SQL Server Standard` or `Windows with SQL Server Web`.
     * 
     */
    @InputImport(name="instancePlatform")
    private final @Nullable Input<Either<String,InstancePlatform>> instancePlatform;

    public Input<Either<String,InstancePlatform>> getInstancePlatform() {
        return this.instancePlatform == null ? Input.empty() : this.instancePlatform;
    }

    /**
     * The instance type for which to reserve capacity.
     * 
     */
    @InputImport(name="instanceType")
    private final @Nullable Input<Either<String,InstanceType>> instanceType;

    public Input<Either<String,InstanceType>> getInstanceType() {
        return this.instanceType == null ? Input.empty() : this.instanceType;
    }

    /**
     * The Amazon Resource Name (ARN) of the Outpost on which to create the Capacity Reservation.
     * 
     */
    @InputImport(name="outpostArn")
    private final @Nullable Input<String> outpostArn;

    public Input<String> getOutpostArn() {
        return this.outpostArn == null ? Input.empty() : this.outpostArn;
    }

    /**
     * The ID of the AWS account that owns the Capacity Reservation.
     * 
     */
    @InputImport(name="ownerId")
    private final @Nullable Input<String> ownerId;

    public Input<String> getOwnerId() {
        return this.ownerId == null ? Input.empty() : this.ownerId;
    }

    /**
     * A map of tags to assign to the resource. If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     * 
     */
    @InputImport(name="tags")
    private final @Nullable Input<Map<String,String>> tags;

    public Input<Map<String,String>> getTags() {
        return this.tags == null ? Input.empty() : this.tags;
    }

    @InputImport(name="tagsAll")
    private final @Nullable Input<Map<String,String>> tagsAll;

    public Input<Map<String,String>> getTagsAll() {
        return this.tagsAll == null ? Input.empty() : this.tagsAll;
    }

    /**
     * Indicates the tenancy of the Capacity Reservation. Specify either `default` or `dedicated`.
     * 
     */
    @InputImport(name="tenancy")
    private final @Nullable Input<Either<String,Tenancy>> tenancy;

    public Input<Either<String,Tenancy>> getTenancy() {
        return this.tenancy == null ? Input.empty() : this.tenancy;
    }

    public CapacityReservationState(
        @Nullable Input<String> arn,
        @Nullable Input<String> availabilityZone,
        @Nullable Input<Boolean> ebsOptimized,
        @Nullable Input<String> endDate,
        @Nullable Input<String> endDateType,
        @Nullable Input<Boolean> ephemeralStorage,
        @Nullable Input<Integer> instanceCount,
        @Nullable Input<String> instanceMatchCriteria,
        @Nullable Input<Either<String,InstancePlatform>> instancePlatform,
        @Nullable Input<Either<String,InstanceType>> instanceType,
        @Nullable Input<String> outpostArn,
        @Nullable Input<String> ownerId,
        @Nullable Input<Map<String,String>> tags,
        @Nullable Input<Map<String,String>> tagsAll,
        @Nullable Input<Either<String,Tenancy>> tenancy) {
        this.arn = arn;
        this.availabilityZone = availabilityZone;
        this.ebsOptimized = ebsOptimized;
        this.endDate = endDate;
        this.endDateType = endDateType;
        this.ephemeralStorage = ephemeralStorage;
        this.instanceCount = instanceCount;
        this.instanceMatchCriteria = instanceMatchCriteria;
        this.instancePlatform = instancePlatform;
        this.instanceType = instanceType;
        this.outpostArn = outpostArn;
        this.ownerId = ownerId;
        this.tags = tags;
        this.tagsAll = tagsAll;
        this.tenancy = tenancy;
    }

    private CapacityReservationState() {
        this.arn = Input.empty();
        this.availabilityZone = Input.empty();
        this.ebsOptimized = Input.empty();
        this.endDate = Input.empty();
        this.endDateType = Input.empty();
        this.ephemeralStorage = Input.empty();
        this.instanceCount = Input.empty();
        this.instanceMatchCriteria = Input.empty();
        this.instancePlatform = Input.empty();
        this.instanceType = Input.empty();
        this.outpostArn = Input.empty();
        this.ownerId = Input.empty();
        this.tags = Input.empty();
        this.tagsAll = Input.empty();
        this.tenancy = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(CapacityReservationState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> arn;
        private @Nullable Input<String> availabilityZone;
        private @Nullable Input<Boolean> ebsOptimized;
        private @Nullable Input<String> endDate;
        private @Nullable Input<String> endDateType;
        private @Nullable Input<Boolean> ephemeralStorage;
        private @Nullable Input<Integer> instanceCount;
        private @Nullable Input<String> instanceMatchCriteria;
        private @Nullable Input<Either<String,InstancePlatform>> instancePlatform;
        private @Nullable Input<Either<String,InstanceType>> instanceType;
        private @Nullable Input<String> outpostArn;
        private @Nullable Input<String> ownerId;
        private @Nullable Input<Map<String,String>> tags;
        private @Nullable Input<Map<String,String>> tagsAll;
        private @Nullable Input<Either<String,Tenancy>> tenancy;

        public Builder() {
    	      // Empty
        }

        public Builder(CapacityReservationState defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.arn = defaults.arn;
    	      this.availabilityZone = defaults.availabilityZone;
    	      this.ebsOptimized = defaults.ebsOptimized;
    	      this.endDate = defaults.endDate;
    	      this.endDateType = defaults.endDateType;
    	      this.ephemeralStorage = defaults.ephemeralStorage;
    	      this.instanceCount = defaults.instanceCount;
    	      this.instanceMatchCriteria = defaults.instanceMatchCriteria;
    	      this.instancePlatform = defaults.instancePlatform;
    	      this.instanceType = defaults.instanceType;
    	      this.outpostArn = defaults.outpostArn;
    	      this.ownerId = defaults.ownerId;
    	      this.tags = defaults.tags;
    	      this.tagsAll = defaults.tagsAll;
    	      this.tenancy = defaults.tenancy;
        }

        public Builder setArn(@Nullable Input<String> arn) {
            this.arn = arn;
            return this;
        }

        public Builder setArn(@Nullable String arn) {
            this.arn = Input.ofNullable(arn);
            return this;
        }

        public Builder setAvailabilityZone(@Nullable Input<String> availabilityZone) {
            this.availabilityZone = availabilityZone;
            return this;
        }

        public Builder setAvailabilityZone(@Nullable String availabilityZone) {
            this.availabilityZone = Input.ofNullable(availabilityZone);
            return this;
        }

        public Builder setEbsOptimized(@Nullable Input<Boolean> ebsOptimized) {
            this.ebsOptimized = ebsOptimized;
            return this;
        }

        public Builder setEbsOptimized(@Nullable Boolean ebsOptimized) {
            this.ebsOptimized = Input.ofNullable(ebsOptimized);
            return this;
        }

        public Builder setEndDate(@Nullable Input<String> endDate) {
            this.endDate = endDate;
            return this;
        }

        public Builder setEndDate(@Nullable String endDate) {
            this.endDate = Input.ofNullable(endDate);
            return this;
        }

        public Builder setEndDateType(@Nullable Input<String> endDateType) {
            this.endDateType = endDateType;
            return this;
        }

        public Builder setEndDateType(@Nullable String endDateType) {
            this.endDateType = Input.ofNullable(endDateType);
            return this;
        }

        public Builder setEphemeralStorage(@Nullable Input<Boolean> ephemeralStorage) {
            this.ephemeralStorage = ephemeralStorage;
            return this;
        }

        public Builder setEphemeralStorage(@Nullable Boolean ephemeralStorage) {
            this.ephemeralStorage = Input.ofNullable(ephemeralStorage);
            return this;
        }

        public Builder setInstanceCount(@Nullable Input<Integer> instanceCount) {
            this.instanceCount = instanceCount;
            return this;
        }

        public Builder setInstanceCount(@Nullable Integer instanceCount) {
            this.instanceCount = Input.ofNullable(instanceCount);
            return this;
        }

        public Builder setInstanceMatchCriteria(@Nullable Input<String> instanceMatchCriteria) {
            this.instanceMatchCriteria = instanceMatchCriteria;
            return this;
        }

        public Builder setInstanceMatchCriteria(@Nullable String instanceMatchCriteria) {
            this.instanceMatchCriteria = Input.ofNullable(instanceMatchCriteria);
            return this;
        }

        public Builder setInstancePlatform(@Nullable Input<Either<String,InstancePlatform>> instancePlatform) {
            this.instancePlatform = instancePlatform;
            return this;
        }

        public Builder setInstancePlatform(@Nullable Either<String,InstancePlatform> instancePlatform) {
            this.instancePlatform = Input.ofNullable(instancePlatform);
            return this;
        }

        public Builder setInstanceType(@Nullable Input<Either<String,InstanceType>> instanceType) {
            this.instanceType = instanceType;
            return this;
        }

        public Builder setInstanceType(@Nullable Either<String,InstanceType> instanceType) {
            this.instanceType = Input.ofNullable(instanceType);
            return this;
        }

        public Builder setOutpostArn(@Nullable Input<String> outpostArn) {
            this.outpostArn = outpostArn;
            return this;
        }

        public Builder setOutpostArn(@Nullable String outpostArn) {
            this.outpostArn = Input.ofNullable(outpostArn);
            return this;
        }

        public Builder setOwnerId(@Nullable Input<String> ownerId) {
            this.ownerId = ownerId;
            return this;
        }

        public Builder setOwnerId(@Nullable String ownerId) {
            this.ownerId = Input.ofNullable(ownerId);
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

        public Builder setTenancy(@Nullable Input<Either<String,Tenancy>> tenancy) {
            this.tenancy = tenancy;
            return this;
        }

        public Builder setTenancy(@Nullable Either<String,Tenancy> tenancy) {
            this.tenancy = Input.ofNullable(tenancy);
            return this;
        }
        public CapacityReservationState build() {
            return new CapacityReservationState(arn, availabilityZone, ebsOptimized, endDate, endDateType, ephemeralStorage, instanceCount, instanceMatchCriteria, instancePlatform, instanceType, outpostArn, ownerId, tags, tagsAll, tenancy);
        }
    }
}
