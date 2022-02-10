// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.desktopvirtualization.outputs;

import io.pulumi.azurenative.desktopvirtualization.outputs.MsixPackageApplicationsResponse;
import io.pulumi.azurenative.desktopvirtualization.outputs.MsixPackageDependenciesResponse;
import io.pulumi.core.internal.annotations.OutputCustomType;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class GetMSIXPackageResult {
    private final @Nullable String displayName;
    private final String id;
    private final @Nullable String imagePath;
    private final @Nullable Boolean isActive;
    private final @Nullable Boolean isRegularRegistration;
    private final @Nullable String lastUpdated;
    private final String name;
    private final @Nullable List<MsixPackageApplicationsResponse> packageApplications;
    private final @Nullable List<MsixPackageDependenciesResponse> packageDependencies;
    private final @Nullable String packageFamilyName;
    private final @Nullable String packageName;
    private final @Nullable String packageRelativePath;
    private final String type;
    private final @Nullable String version;

    @OutputCustomType.Constructor({"displayName","id","imagePath","isActive","isRegularRegistration","lastUpdated","name","packageApplications","packageDependencies","packageFamilyName","packageName","packageRelativePath","type","version"})
    private GetMSIXPackageResult(
        @Nullable String displayName,
        String id,
        @Nullable String imagePath,
        @Nullable Boolean isActive,
        @Nullable Boolean isRegularRegistration,
        @Nullable String lastUpdated,
        String name,
        @Nullable List<MsixPackageApplicationsResponse> packageApplications,
        @Nullable List<MsixPackageDependenciesResponse> packageDependencies,
        @Nullable String packageFamilyName,
        @Nullable String packageName,
        @Nullable String packageRelativePath,
        String type,
        @Nullable String version) {
        this.displayName = displayName;
        this.id = Objects.requireNonNull(id);
        this.imagePath = imagePath;
        this.isActive = isActive;
        this.isRegularRegistration = isRegularRegistration;
        this.lastUpdated = lastUpdated;
        this.name = Objects.requireNonNull(name);
        this.packageApplications = packageApplications;
        this.packageDependencies = packageDependencies;
        this.packageFamilyName = packageFamilyName;
        this.packageName = packageName;
        this.packageRelativePath = packageRelativePath;
        this.type = Objects.requireNonNull(type);
        this.version = version;
    }

    public Optional<String> getDisplayName() {
        return Optional.ofNullable(this.displayName);
    }
    public String getId() {
        return this.id;
    }
    public Optional<String> getImagePath() {
        return Optional.ofNullable(this.imagePath);
    }
    public Optional<Boolean> getIsActive() {
        return Optional.ofNullable(this.isActive);
    }
    public Optional<Boolean> getIsRegularRegistration() {
        return Optional.ofNullable(this.isRegularRegistration);
    }
    public Optional<String> getLastUpdated() {
        return Optional.ofNullable(this.lastUpdated);
    }
    public String getName() {
        return this.name;
    }
    public List<MsixPackageApplicationsResponse> getPackageApplications() {
        return this.packageApplications == null ? List.of() : this.packageApplications;
    }
    public List<MsixPackageDependenciesResponse> getPackageDependencies() {
        return this.packageDependencies == null ? List.of() : this.packageDependencies;
    }
    public Optional<String> getPackageFamilyName() {
        return Optional.ofNullable(this.packageFamilyName);
    }
    public Optional<String> getPackageName() {
        return Optional.ofNullable(this.packageName);
    }
    public Optional<String> getPackageRelativePath() {
        return Optional.ofNullable(this.packageRelativePath);
    }
    public String getType() {
        return this.type;
    }
    public Optional<String> getVersion() {
        return Optional.ofNullable(this.version);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetMSIXPackageResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String displayName;
        private String id;
        private @Nullable String imagePath;
        private @Nullable Boolean isActive;
        private @Nullable Boolean isRegularRegistration;
        private @Nullable String lastUpdated;
        private String name;
        private @Nullable List<MsixPackageApplicationsResponse> packageApplications;
        private @Nullable List<MsixPackageDependenciesResponse> packageDependencies;
        private @Nullable String packageFamilyName;
        private @Nullable String packageName;
        private @Nullable String packageRelativePath;
        private String type;
        private @Nullable String version;

        public Builder() {
    	      // Empty
        }

        public Builder(GetMSIXPackageResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.displayName = defaults.displayName;
    	      this.id = defaults.id;
    	      this.imagePath = defaults.imagePath;
    	      this.isActive = defaults.isActive;
    	      this.isRegularRegistration = defaults.isRegularRegistration;
    	      this.lastUpdated = defaults.lastUpdated;
    	      this.name = defaults.name;
    	      this.packageApplications = defaults.packageApplications;
    	      this.packageDependencies = defaults.packageDependencies;
    	      this.packageFamilyName = defaults.packageFamilyName;
    	      this.packageName = defaults.packageName;
    	      this.packageRelativePath = defaults.packageRelativePath;
    	      this.type = defaults.type;
    	      this.version = defaults.version;
        }

        public Builder setDisplayName(@Nullable String displayName) {
            this.displayName = displayName;
            return this;
        }

        public Builder setId(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }

        public Builder setImagePath(@Nullable String imagePath) {
            this.imagePath = imagePath;
            return this;
        }

        public Builder setIsActive(@Nullable Boolean isActive) {
            this.isActive = isActive;
            return this;
        }

        public Builder setIsRegularRegistration(@Nullable Boolean isRegularRegistration) {
            this.isRegularRegistration = isRegularRegistration;
            return this;
        }

        public Builder setLastUpdated(@Nullable String lastUpdated) {
            this.lastUpdated = lastUpdated;
            return this;
        }

        public Builder setName(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }

        public Builder setPackageApplications(@Nullable List<MsixPackageApplicationsResponse> packageApplications) {
            this.packageApplications = packageApplications;
            return this;
        }

        public Builder setPackageDependencies(@Nullable List<MsixPackageDependenciesResponse> packageDependencies) {
            this.packageDependencies = packageDependencies;
            return this;
        }

        public Builder setPackageFamilyName(@Nullable String packageFamilyName) {
            this.packageFamilyName = packageFamilyName;
            return this;
        }

        public Builder setPackageName(@Nullable String packageName) {
            this.packageName = packageName;
            return this;
        }

        public Builder setPackageRelativePath(@Nullable String packageRelativePath) {
            this.packageRelativePath = packageRelativePath;
            return this;
        }

        public Builder setType(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }

        public Builder setVersion(@Nullable String version) {
            this.version = version;
            return this;
        }

        public GetMSIXPackageResult build() {
            return new GetMSIXPackageResult(displayName, id, imagePath, isActive, isRegularRegistration, lastUpdated, name, packageApplications, packageDependencies, packageFamilyName, packageName, packageRelativePath, type, version);
        }
    }
}