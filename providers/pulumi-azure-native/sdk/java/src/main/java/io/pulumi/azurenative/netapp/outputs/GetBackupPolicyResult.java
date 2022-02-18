// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.netapp.outputs;

import io.pulumi.azurenative.netapp.outputs.VolumeBackupsResponse;
import io.pulumi.core.annotations.OutputCustomType;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class GetBackupPolicyResult {
    /**
     * Daily backups count to keep
     * 
     */
    private final @Nullable Integer dailyBackupsToKeep;
    /**
     * The property to decide policy is enabled or not
     * 
     */
    private final @Nullable Boolean enabled;
    /**
     * Resource Id
     * 
     */
    private final String id;
    /**
     * Resource location
     * 
     */
    private final String location;
    /**
     * Monthly backups count to keep
     * 
     */
    private final @Nullable Integer monthlyBackupsToKeep;
    /**
     * Name of backup policy
     * 
     */
    private final String name;
    /**
     * Azure lifecycle management
     * 
     */
    private final String provisioningState;
    /**
     * Resource tags
     * 
     */
    private final @Nullable Map<String,String> tags;
    /**
     * Resource type
     * 
     */
    private final String type;
    /**
     * A list of volumes assigned to this policy
     * 
     */
    private final @Nullable List<VolumeBackupsResponse> volumeBackups;
    /**
     * Volumes using current backup policy
     * 
     */
    private final @Nullable Integer volumesAssigned;
    /**
     * Weekly backups count to keep
     * 
     */
    private final @Nullable Integer weeklyBackupsToKeep;
    /**
     * Yearly backups count to keep
     * 
     */
    private final @Nullable Integer yearlyBackupsToKeep;

    @OutputCustomType.Constructor({"dailyBackupsToKeep","enabled","id","location","monthlyBackupsToKeep","name","provisioningState","tags","type","volumeBackups","volumesAssigned","weeklyBackupsToKeep","yearlyBackupsToKeep"})
    private GetBackupPolicyResult(
        @Nullable Integer dailyBackupsToKeep,
        @Nullable Boolean enabled,
        String id,
        String location,
        @Nullable Integer monthlyBackupsToKeep,
        String name,
        String provisioningState,
        @Nullable Map<String,String> tags,
        String type,
        @Nullable List<VolumeBackupsResponse> volumeBackups,
        @Nullable Integer volumesAssigned,
        @Nullable Integer weeklyBackupsToKeep,
        @Nullable Integer yearlyBackupsToKeep) {
        this.dailyBackupsToKeep = dailyBackupsToKeep;
        this.enabled = enabled;
        this.id = Objects.requireNonNull(id);
        this.location = Objects.requireNonNull(location);
        this.monthlyBackupsToKeep = monthlyBackupsToKeep;
        this.name = Objects.requireNonNull(name);
        this.provisioningState = Objects.requireNonNull(provisioningState);
        this.tags = tags;
        this.type = Objects.requireNonNull(type);
        this.volumeBackups = volumeBackups;
        this.volumesAssigned = volumesAssigned;
        this.weeklyBackupsToKeep = weeklyBackupsToKeep;
        this.yearlyBackupsToKeep = yearlyBackupsToKeep;
    }

    /**
     * Daily backups count to keep
     * 
     */
    public Optional<Integer> getDailyBackupsToKeep() {
        return Optional.ofNullable(this.dailyBackupsToKeep);
    }
    /**
     * The property to decide policy is enabled or not
     * 
     */
    public Optional<Boolean> getEnabled() {
        return Optional.ofNullable(this.enabled);
    }
    /**
     * Resource Id
     * 
     */
    public String getId() {
        return this.id;
    }
    /**
     * Resource location
     * 
     */
    public String getLocation() {
        return this.location;
    }
    /**
     * Monthly backups count to keep
     * 
     */
    public Optional<Integer> getMonthlyBackupsToKeep() {
        return Optional.ofNullable(this.monthlyBackupsToKeep);
    }
    /**
     * Name of backup policy
     * 
     */
    public String getName() {
        return this.name;
    }
    /**
     * Azure lifecycle management
     * 
     */
    public String getProvisioningState() {
        return this.provisioningState;
    }
    /**
     * Resource tags
     * 
     */
    public Map<String,String> getTags() {
        return this.tags == null ? Map.of() : this.tags;
    }
    /**
     * Resource type
     * 
     */
    public String getType() {
        return this.type;
    }
    /**
     * A list of volumes assigned to this policy
     * 
     */
    public List<VolumeBackupsResponse> getVolumeBackups() {
        return this.volumeBackups == null ? List.of() : this.volumeBackups;
    }
    /**
     * Volumes using current backup policy
     * 
     */
    public Optional<Integer> getVolumesAssigned() {
        return Optional.ofNullable(this.volumesAssigned);
    }
    /**
     * Weekly backups count to keep
     * 
     */
    public Optional<Integer> getWeeklyBackupsToKeep() {
        return Optional.ofNullable(this.weeklyBackupsToKeep);
    }
    /**
     * Yearly backups count to keep
     * 
     */
    public Optional<Integer> getYearlyBackupsToKeep() {
        return Optional.ofNullable(this.yearlyBackupsToKeep);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetBackupPolicyResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Integer dailyBackupsToKeep;
        private @Nullable Boolean enabled;
        private String id;
        private String location;
        private @Nullable Integer monthlyBackupsToKeep;
        private String name;
        private String provisioningState;
        private @Nullable Map<String,String> tags;
        private String type;
        private @Nullable List<VolumeBackupsResponse> volumeBackups;
        private @Nullable Integer volumesAssigned;
        private @Nullable Integer weeklyBackupsToKeep;
        private @Nullable Integer yearlyBackupsToKeep;

        public Builder() {
    	      // Empty
        }

        public Builder(GetBackupPolicyResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.dailyBackupsToKeep = defaults.dailyBackupsToKeep;
    	      this.enabled = defaults.enabled;
    	      this.id = defaults.id;
    	      this.location = defaults.location;
    	      this.monthlyBackupsToKeep = defaults.monthlyBackupsToKeep;
    	      this.name = defaults.name;
    	      this.provisioningState = defaults.provisioningState;
    	      this.tags = defaults.tags;
    	      this.type = defaults.type;
    	      this.volumeBackups = defaults.volumeBackups;
    	      this.volumesAssigned = defaults.volumesAssigned;
    	      this.weeklyBackupsToKeep = defaults.weeklyBackupsToKeep;
    	      this.yearlyBackupsToKeep = defaults.yearlyBackupsToKeep;
        }

        public Builder setDailyBackupsToKeep(@Nullable Integer dailyBackupsToKeep) {
            this.dailyBackupsToKeep = dailyBackupsToKeep;
            return this;
        }

        public Builder setEnabled(@Nullable Boolean enabled) {
            this.enabled = enabled;
            return this;
        }

        public Builder setId(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }

        public Builder setLocation(String location) {
            this.location = Objects.requireNonNull(location);
            return this;
        }

        public Builder setMonthlyBackupsToKeep(@Nullable Integer monthlyBackupsToKeep) {
            this.monthlyBackupsToKeep = monthlyBackupsToKeep;
            return this;
        }

        public Builder setName(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }

        public Builder setProvisioningState(String provisioningState) {
            this.provisioningState = Objects.requireNonNull(provisioningState);
            return this;
        }

        public Builder setTags(@Nullable Map<String,String> tags) {
            this.tags = tags;
            return this;
        }

        public Builder setType(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }

        public Builder setVolumeBackups(@Nullable List<VolumeBackupsResponse> volumeBackups) {
            this.volumeBackups = volumeBackups;
            return this;
        }

        public Builder setVolumesAssigned(@Nullable Integer volumesAssigned) {
            this.volumesAssigned = volumesAssigned;
            return this;
        }

        public Builder setWeeklyBackupsToKeep(@Nullable Integer weeklyBackupsToKeep) {
            this.weeklyBackupsToKeep = weeklyBackupsToKeep;
            return this;
        }

        public Builder setYearlyBackupsToKeep(@Nullable Integer yearlyBackupsToKeep) {
            this.yearlyBackupsToKeep = yearlyBackupsToKeep;
            return this;
        }

        public GetBackupPolicyResult build() {
            return new GetBackupPolicyResult(dailyBackupsToKeep, enabled, id, location, monthlyBackupsToKeep, name, provisioningState, tags, type, volumeBackups, volumesAssigned, weeklyBackupsToKeep, yearlyBackupsToKeep);
        }
    }
}
