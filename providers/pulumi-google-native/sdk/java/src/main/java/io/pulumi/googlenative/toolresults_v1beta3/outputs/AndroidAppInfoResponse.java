// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.toolresults_v1beta3.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;

@OutputCustomType
public final class AndroidAppInfoResponse {
    /**
     * The name of the app. Optional
     * 
     */
    private final String name;
    /**
     * The package name of the app. Required.
     * 
     */
    private final String packageName;
    /**
     * The internal version code of the app. Optional.
     * 
     */
    private final String versionCode;
    /**
     * The version name of the app. Optional.
     * 
     */
    private final String versionName;

    @OutputCustomType.Constructor({"name","packageName","versionCode","versionName"})
    private AndroidAppInfoResponse(
        String name,
        String packageName,
        String versionCode,
        String versionName) {
        this.name = Objects.requireNonNull(name);
        this.packageName = Objects.requireNonNull(packageName);
        this.versionCode = Objects.requireNonNull(versionCode);
        this.versionName = Objects.requireNonNull(versionName);
    }

    /**
     * The name of the app. Optional
     * 
     */
    public String getName() {
        return this.name;
    }
    /**
     * The package name of the app. Required.
     * 
     */
    public String getPackageName() {
        return this.packageName;
    }
    /**
     * The internal version code of the app. Optional.
     * 
     */
    public String getVersionCode() {
        return this.versionCode;
    }
    /**
     * The version name of the app. Optional.
     * 
     */
    public String getVersionName() {
        return this.versionName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AndroidAppInfoResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String name;
        private String packageName;
        private String versionCode;
        private String versionName;

        public Builder() {
    	      // Empty
        }

        public Builder(AndroidAppInfoResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.name = defaults.name;
    	      this.packageName = defaults.packageName;
    	      this.versionCode = defaults.versionCode;
    	      this.versionName = defaults.versionName;
        }

        public Builder setName(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }

        public Builder setPackageName(String packageName) {
            this.packageName = Objects.requireNonNull(packageName);
            return this;
        }

        public Builder setVersionCode(String versionCode) {
            this.versionCode = Objects.requireNonNull(versionCode);
            return this;
        }

        public Builder setVersionName(String versionName) {
            this.versionName = Objects.requireNonNull(versionName);
            return this;
        }
        public AndroidAppInfoResponse build() {
            return new AndroidAppInfoResponse(name, packageName, versionCode, versionName);
        }
    }
}
