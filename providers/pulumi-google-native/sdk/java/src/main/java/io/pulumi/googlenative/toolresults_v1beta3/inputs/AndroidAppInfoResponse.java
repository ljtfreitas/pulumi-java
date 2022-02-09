// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.toolresults_v1beta3.inputs;

import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.Objects;


public final class AndroidAppInfoResponse extends io.pulumi.resources.InvokeArgs {

    public static final AndroidAppInfoResponse Empty = new AndroidAppInfoResponse();

    @InputImport(name="name", required=true)
    private final String name;

    public String getName() {
        return this.name;
    }

    @InputImport(name="packageName", required=true)
    private final String packageName;

    public String getPackageName() {
        return this.packageName;
    }

    @InputImport(name="versionCode", required=true)
    private final String versionCode;

    public String getVersionCode() {
        return this.versionCode;
    }

    @InputImport(name="versionName", required=true)
    private final String versionName;

    public String getVersionName() {
        return this.versionName;
    }

    public AndroidAppInfoResponse(
        String name,
        String packageName,
        String versionCode,
        String versionName) {
        this.name = Objects.requireNonNull(name, "expected parameter 'name' to be non-null");
        this.packageName = Objects.requireNonNull(packageName, "expected parameter 'packageName' to be non-null");
        this.versionCode = Objects.requireNonNull(versionCode, "expected parameter 'versionCode' to be non-null");
        this.versionName = Objects.requireNonNull(versionName, "expected parameter 'versionName' to be non-null");
    }

    private AndroidAppInfoResponse() {
        this.name = null;
        this.packageName = null;
        this.versionCode = null;
        this.versionName = null;
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