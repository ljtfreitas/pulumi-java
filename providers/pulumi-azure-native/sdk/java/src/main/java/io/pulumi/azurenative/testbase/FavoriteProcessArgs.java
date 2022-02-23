// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.testbase;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class FavoriteProcessArgs extends io.pulumi.resources.ResourceArgs {

    public static final FavoriteProcessArgs Empty = new FavoriteProcessArgs();

    /**
     * The actual name of the favorite process. It will be equal to resource name except for the scenario that the process name contains characters that are not allowed in the resource name.
     * 
     */
    @InputImport(name="actualProcessName", required=true)
        private final Input<String> actualProcessName;

    public Input<String> getActualProcessName() {
        return this.actualProcessName;
    }

    /**
     * The resource name of a favorite process in a package. If the process name contains characters that are not allowed in Azure Resource Name, we use 'actualProcessName' in request body to submit the name.
     * 
     */
    @InputImport(name="favoriteProcessResourceName")
        private final @Nullable Input<String> favoriteProcessResourceName;

    public Input<String> getFavoriteProcessResourceName() {
        return this.favoriteProcessResourceName == null ? Input.empty() : this.favoriteProcessResourceName;
    }

    /**
     * The resource name of the Test Base Package.
     * 
     */
    @InputImport(name="packageName", required=true)
        private final Input<String> packageName;

    public Input<String> getPackageName() {
        return this.packageName;
    }

    /**
     * The name of the resource group that contains the resource.
     * 
     */
    @InputImport(name="resourceGroupName", required=true)
        private final Input<String> resourceGroupName;

    public Input<String> getResourceGroupName() {
        return this.resourceGroupName;
    }

    /**
     * The resource name of the Test Base Account.
     * 
     */
    @InputImport(name="testBaseAccountName", required=true)
        private final Input<String> testBaseAccountName;

    public Input<String> getTestBaseAccountName() {
        return this.testBaseAccountName;
    }

    public FavoriteProcessArgs(
        Input<String> actualProcessName,
        @Nullable Input<String> favoriteProcessResourceName,
        Input<String> packageName,
        Input<String> resourceGroupName,
        Input<String> testBaseAccountName) {
        this.actualProcessName = Objects.requireNonNull(actualProcessName, "expected parameter 'actualProcessName' to be non-null");
        this.favoriteProcessResourceName = favoriteProcessResourceName;
        this.packageName = Objects.requireNonNull(packageName, "expected parameter 'packageName' to be non-null");
        this.resourceGroupName = Objects.requireNonNull(resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
        this.testBaseAccountName = Objects.requireNonNull(testBaseAccountName, "expected parameter 'testBaseAccountName' to be non-null");
    }

    private FavoriteProcessArgs() {
        this.actualProcessName = Input.empty();
        this.favoriteProcessResourceName = Input.empty();
        this.packageName = Input.empty();
        this.resourceGroupName = Input.empty();
        this.testBaseAccountName = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(FavoriteProcessArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<String> actualProcessName;
        private @Nullable Input<String> favoriteProcessResourceName;
        private Input<String> packageName;
        private Input<String> resourceGroupName;
        private Input<String> testBaseAccountName;

        public Builder() {
    	      // Empty
        }

        public Builder(FavoriteProcessArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.actualProcessName = defaults.actualProcessName;
    	      this.favoriteProcessResourceName = defaults.favoriteProcessResourceName;
    	      this.packageName = defaults.packageName;
    	      this.resourceGroupName = defaults.resourceGroupName;
    	      this.testBaseAccountName = defaults.testBaseAccountName;
        }

        public Builder setActualProcessName(Input<String> actualProcessName) {
            this.actualProcessName = Objects.requireNonNull(actualProcessName);
            return this;
        }

        public Builder setActualProcessName(String actualProcessName) {
            this.actualProcessName = Input.of(Objects.requireNonNull(actualProcessName));
            return this;
        }

        public Builder setFavoriteProcessResourceName(@Nullable Input<String> favoriteProcessResourceName) {
            this.favoriteProcessResourceName = favoriteProcessResourceName;
            return this;
        }

        public Builder setFavoriteProcessResourceName(@Nullable String favoriteProcessResourceName) {
            this.favoriteProcessResourceName = Input.ofNullable(favoriteProcessResourceName);
            return this;
        }

        public Builder setPackageName(Input<String> packageName) {
            this.packageName = Objects.requireNonNull(packageName);
            return this;
        }

        public Builder setPackageName(String packageName) {
            this.packageName = Input.of(Objects.requireNonNull(packageName));
            return this;
        }

        public Builder setResourceGroupName(Input<String> resourceGroupName) {
            this.resourceGroupName = Objects.requireNonNull(resourceGroupName);
            return this;
        }

        public Builder setResourceGroupName(String resourceGroupName) {
            this.resourceGroupName = Input.of(Objects.requireNonNull(resourceGroupName));
            return this;
        }

        public Builder setTestBaseAccountName(Input<String> testBaseAccountName) {
            this.testBaseAccountName = Objects.requireNonNull(testBaseAccountName);
            return this;
        }

        public Builder setTestBaseAccountName(String testBaseAccountName) {
            this.testBaseAccountName = Input.of(Objects.requireNonNull(testBaseAccountName));
            return this;
        }
        public FavoriteProcessArgs build() {
            return new FavoriteProcessArgs(actualProcessName, favoriteProcessResourceName, packageName, resourceGroupName, testBaseAccountName);
        }
    }
}
