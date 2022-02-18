// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.elastic.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class ListUpgradableVersionDetailsResult {
    /**
     * Current version of the elastic monitor
     * 
     */
    private final @Nullable String currentVersion;
    /**
     * Stack Versions that this version can upgrade to
     * 
     */
    private final @Nullable List<String> upgradableVersions;

    @OutputCustomType.Constructor({"currentVersion","upgradableVersions"})
    private ListUpgradableVersionDetailsResult(
        @Nullable String currentVersion,
        @Nullable List<String> upgradableVersions) {
        this.currentVersion = currentVersion;
        this.upgradableVersions = upgradableVersions;
    }

    /**
     * Current version of the elastic monitor
     * 
     */
    public Optional<String> getCurrentVersion() {
        return Optional.ofNullable(this.currentVersion);
    }
    /**
     * Stack Versions that this version can upgrade to
     * 
     */
    public List<String> getUpgradableVersions() {
        return this.upgradableVersions == null ? List.of() : this.upgradableVersions;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ListUpgradableVersionDetailsResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String currentVersion;
        private @Nullable List<String> upgradableVersions;

        public Builder() {
    	      // Empty
        }

        public Builder(ListUpgradableVersionDetailsResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.currentVersion = defaults.currentVersion;
    	      this.upgradableVersions = defaults.upgradableVersions;
        }

        public Builder setCurrentVersion(@Nullable String currentVersion) {
            this.currentVersion = currentVersion;
            return this;
        }

        public Builder setUpgradableVersions(@Nullable List<String> upgradableVersions) {
            this.upgradableVersions = upgradableVersions;
            return this;
        }

        public ListUpgradableVersionDetailsResult build() {
            return new ListUpgradableVersionDetailsResult(currentVersion, upgradableVersions);
        }
    }
}
