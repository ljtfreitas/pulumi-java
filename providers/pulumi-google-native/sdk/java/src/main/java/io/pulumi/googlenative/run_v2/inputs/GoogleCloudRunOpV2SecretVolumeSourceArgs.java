// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.run_v2.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import io.pulumi.googlenative.run_v2.inputs.GoogleCloudRunOpV2VersionToPathArgs;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class GoogleCloudRunOpV2SecretVolumeSourceArgs extends io.pulumi.resources.ResourceArgs {

    public static final GoogleCloudRunOpV2SecretVolumeSourceArgs Empty = new GoogleCloudRunOpV2SecretVolumeSourceArgs();

    @InputImport(name="defaultMode")
    private final @Nullable Input<Integer> defaultMode;

    public Input<Integer> getDefaultMode() {
        return this.defaultMode == null ? Input.empty() : this.defaultMode;
    }

    @InputImport(name="items")
    private final @Nullable Input<List<GoogleCloudRunOpV2VersionToPathArgs>> items;

    public Input<List<GoogleCloudRunOpV2VersionToPathArgs>> getItems() {
        return this.items == null ? Input.empty() : this.items;
    }

    @InputImport(name="secret", required=true)
    private final Input<String> secret;

    public Input<String> getSecret() {
        return this.secret;
    }

    public GoogleCloudRunOpV2SecretVolumeSourceArgs(
        @Nullable Input<Integer> defaultMode,
        @Nullable Input<List<GoogleCloudRunOpV2VersionToPathArgs>> items,
        Input<String> secret) {
        this.defaultMode = defaultMode;
        this.items = items;
        this.secret = Objects.requireNonNull(secret, "expected parameter 'secret' to be non-null");
    }

    private GoogleCloudRunOpV2SecretVolumeSourceArgs() {
        this.defaultMode = Input.empty();
        this.items = Input.empty();
        this.secret = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GoogleCloudRunOpV2SecretVolumeSourceArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<Integer> defaultMode;
        private @Nullable Input<List<GoogleCloudRunOpV2VersionToPathArgs>> items;
        private Input<String> secret;

        public Builder() {
    	      // Empty
        }

        public Builder(GoogleCloudRunOpV2SecretVolumeSourceArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.defaultMode = defaults.defaultMode;
    	      this.items = defaults.items;
    	      this.secret = defaults.secret;
        }

        public Builder setDefaultMode(@Nullable Input<Integer> defaultMode) {
            this.defaultMode = defaultMode;
            return this;
        }

        public Builder setDefaultMode(@Nullable Integer defaultMode) {
            this.defaultMode = Input.ofNullable(defaultMode);
            return this;
        }

        public Builder setItems(@Nullable Input<List<GoogleCloudRunOpV2VersionToPathArgs>> items) {
            this.items = items;
            return this;
        }

        public Builder setItems(@Nullable List<GoogleCloudRunOpV2VersionToPathArgs> items) {
            this.items = Input.ofNullable(items);
            return this;
        }

        public Builder setSecret(Input<String> secret) {
            this.secret = Objects.requireNonNull(secret);
            return this;
        }

        public Builder setSecret(String secret) {
            this.secret = Input.of(Objects.requireNonNull(secret));
            return this;
        }

        public GoogleCloudRunOpV2SecretVolumeSourceArgs build() {
            return new GoogleCloudRunOpV2SecretVolumeSourceArgs(defaultMode, items, secret);
        }
    }
}